package com.mcsoftware.amplituderh.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/** @author c.mbassi */
@AllArgsConstructor
@NoArgsConstructor
public class RhteltvarcongeId implements Serializable {

    private String cdos;

    private String aamm;

    private String nmat;

    private Integer nbul;

    private Date ddeb;
}
