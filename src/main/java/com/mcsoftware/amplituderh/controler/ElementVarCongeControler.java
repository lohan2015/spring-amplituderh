package com.mcsoftware.amplituderh.controler;

import com.mcsoftware.amplituderh.dto.ElementVarCongeDto;
import com.mcsoftware.amplituderh.entity.Rhpagent;
import com.mcsoftware.amplituderh.entity.RhpagentId;
import com.mcsoftware.amplituderh.entity.Rhteltvarent;
import com.mcsoftware.amplituderh.entity.RhteltvarentId;
import com.mcsoftware.amplituderh.repository.ElementVarCongeRepository;
import com.mcsoftware.amplituderh.repository.ElementVariableRepository;
import com.mcsoftware.amplituderh.repository.SalarieRepository;
import com.mcsoftware.amplituderh.validator.ObjectsValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Optional;

@Api("elementvariable-absence-conge")
@RestController
public class ElementVarCongeControler {

    ElementVarCongeRepository repository;
    ObjectsValidator<ElementVarCongeDto> validator;
    SalarieRepository salarieRepository;
    ElementVariableRepository elementVariableRepository;

    @Autowired
    public ElementVarCongeControler(ElementVarCongeRepository repository, SalarieRepository salarieRepository, ElementVariableRepository elementVariableRepository, ObjectsValidator<ElementVarCongeDto> validator){
        this.repository = repository;
        this.salarieRepository = salarieRepository;
        this.elementVariableRepository = elementVariableRepository;
        this.validator = validator;
    }

    @PostMapping(value = "amplituderh/v1/evabsenceconge", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ApiOperation(value = "Sauvegarte élément absence congé", notes = "Cette methode permet d'enregistrer des éléments absence congé")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "L'élément cree / modifie"),
            @ApiResponse(code = 400, message = "L'élément n'est pas valide")
    })
    ResponseEntity<ElementVarCongeDto> saveUser(@RequestBody ElementVarCongeDto dto){
        validator.validate(dto);
        try {
            // MAJ Salarie
            if("O".equalsIgnoreCase(dto.getEstUnCOnge())){
                Optional<Rhpagent> objDB = salarieRepository.findById(new RhpagentId(dto.getCdos(), dto.getNmat()));
                Rhpagent entity = null;
                if(objDB.isPresent()){
                    entity = objDB.get();
                    entity.setNbjcf(dto.getNbjcTotal());
                    entity.setNbjaf(dto.getNbjaTotal());
                    entity.setDdcf(dto.getMinDeb());
                    entity.setDfcf(dto.getMaxFin());
                    entity.setMtcf(new BigDecimal(0));
                    entity.setPmcf(dto.getAamm());

                    salarieRepository.save(entity);
                }
            }

            // Sauvegarder l'E.V.
            Optional<Rhteltvarent> objEVDB = elementVariableRepository.findById(new RhteltvarentId(dto.getCdos(), dto.getAamm(), dto.getNmat(), Integer.valueOf(9)));
            if(!objEVDB.isPresent()){
                Rhteltvarent entity = new Rhteltvarent();
                entity.setAamm(dto.getAamm());
                entity.setCdos(dto.getCdos());
                entity.setDdpa(dto.getFirstDay());
                entity.setDfpa(dto.getLastDay());
                entity.setNmat(dto.getNmat());
                entity.setNbul(Integer.valueOf(9));
                entity.setBcmo("N");
                elementVariableRepository.save(entity);
            }

            // Sauvegarder 'E.V. congé
            repository.save(ElementVarCongeDto.toEntity(dto));

       } catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(dto, HttpStatus.CREATED);
    }


}
