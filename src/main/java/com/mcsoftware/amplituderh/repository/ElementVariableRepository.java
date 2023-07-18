package com.mcsoftware.amplituderh.repository;

import com.mcsoftware.amplituderh.entity.Rhteltvarent;
import com.mcsoftware.amplituderh.entity.RhteltvarentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementVariableRepository extends JpaRepository<Rhteltvarent, RhteltvarentId> {

}
