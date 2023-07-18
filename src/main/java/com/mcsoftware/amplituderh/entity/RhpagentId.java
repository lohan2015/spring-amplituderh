package com.mcsoftware.amplituderh.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/** @author c.mbassi */
@AllArgsConstructor
@NoArgsConstructor
public class RhpagentId  implements Serializable {
    /** identifier field */
    private String cdos;

    /** identifier field */
    private String nmat;
}
