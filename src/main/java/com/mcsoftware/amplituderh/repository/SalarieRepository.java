package com.mcsoftware.amplituderh.repository;

import com.mcsoftware.amplituderh.entity.Rhpagent;
import com.mcsoftware.amplituderh.entity.RhpagentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalarieRepository extends JpaRepository<Rhpagent, RhpagentId>  {

}
