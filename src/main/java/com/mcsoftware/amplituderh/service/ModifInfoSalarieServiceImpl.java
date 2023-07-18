package com.mcsoftware.amplituderh.service;

import com.mcsoftware.amplituderh.dto.ModifInfoSalarieDto;
import com.mcsoftware.amplituderh.entity.Rhpagent;
import com.mcsoftware.amplituderh.entity.RhpagentId;
import com.mcsoftware.amplituderh.repository.SalarieRepository;
import com.mcsoftware.amplituderh.validator.ObjectsValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ModifInfoSalarieServiceImpl implements ModifInfoSalarieService {

    private final SalarieRepository repository;

    private final ObjectsValidator<ModifInfoSalarieDto> validator;

    @Override
    public Rhpagent majSalarie(ModifInfoSalarieDto dto) throws Exception {
        validator.validate(dto);

        Optional<Rhpagent> objDB = repository.findById(new RhpagentId(dto.getCdos(), dto.getMatricule()));
        Rhpagent entity = null;
        if(objDB.isPresent()){
            entity = objDB.get();
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NIV1")) entity.setNiv1(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NIV2")) entity.setNiv2(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NIV3")) entity.setNiv3(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("CODESITE")) entity.setCodesite(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("AFEC")) entity.setAfec(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("ADR1")) entity.setAdr1(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("CAT")) entity.setCat(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("CAT")) entity.setEch(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("FONC")) entity.setFonc(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("GRAD")) entity.setGrad(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("LEMB")) entity.setLemb(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("LNAI")) entity.setLnai(dto.getValue());

            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NOSS")) entity.setNoss(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NATO")) entity.setNato(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NTEL")) entity.setNtel(dto.getValue());
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("NBEC")) entity.setNbec(Integer.valueOf(dto.getValue()));
            if(dto.getKey().toUpperCase(Locale.ROOT).equals("PNAI")) entity.setPnai(dto.getValue());

            repository.save(entity);
        }

        return entity;
    }
}
