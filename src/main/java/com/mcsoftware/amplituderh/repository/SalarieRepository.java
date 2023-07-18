package com.mcsoftware.amplituderh.repository;

import com.mcsoftware.amplituderh.entity.Rhpagent;
import com.mcsoftware.amplituderh.entity.RhpagentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalarieRepository extends JpaRepository<Rhpagent, RhpagentId>  {

}
