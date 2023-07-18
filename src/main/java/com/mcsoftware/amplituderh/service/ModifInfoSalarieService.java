package com.mcsoftware.amplituderh.service;

import com.mcsoftware.amplituderh.dto.ModifInfoSalarieDto;
import com.mcsoftware.amplituderh.entity.Rhpagent;

public interface ModifInfoSalarieService {

    /**
     * Mise a jour info fiche salarié
     *
     * @param dto
     * @return
     * @throws Exception
     */
    Rhpagent majSalarie(ModifInfoSalarieDto dto) throws Exception;
}
