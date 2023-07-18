package com.mcsoftware.amplituderh.controler;

import com.mcsoftware.amplituderh.dto.ModifInfoSalarieDto;
import com.mcsoftware.amplituderh.entity.Rhpagent;
import com.mcsoftware.amplituderh.service.ModifInfoSalarieService;
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

@Api("modification-info-salarie")
@RestController
public class ModificationInfoSalarieControler {

    ModifInfoSalarieService service;

    @Autowired
    public ModificationInfoSalarieControler(ModifInfoSalarieService service){
        this.service = service;
    }

    @PostMapping(value = "amplituderh/v1/modifinfosalarie", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ApiOperation(value = "Modification info salarié", notes = "Cette methode permet de modification info salarié")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "L'élément cree / modifie"),
            @ApiResponse(code = 400, message = "L'élément n'est pas valide")
    })
    ResponseEntity<Rhpagent> majInfoSalarie(@RequestBody ModifInfoSalarieDto dto){
       try {
           service.majSalarie(dto);
       } catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(dto, HttpStatus.CREATED);
    }


}
