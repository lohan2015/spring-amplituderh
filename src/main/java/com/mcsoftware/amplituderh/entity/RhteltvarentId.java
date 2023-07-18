package com.mcsoftware.amplituderh.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/** @author c.mbassi */
@AllArgsConstructor
@NoArgsConstructor
public class RhteltvarentId  implements Serializable {

    /** identifier field */
    private String cdos;

    /** identifier field */
    private String aamm;

    /** identifier field */
    private String nmat;

    /** identifier field */
    private Integer nbul;

}
