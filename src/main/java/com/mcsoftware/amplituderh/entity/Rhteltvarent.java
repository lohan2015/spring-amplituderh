package com.mcsoftware.amplituderh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

/** @author c.mbassi */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Rhteltvarent")
@Table(name = "rhteltvarent")
@IdClass(RhteltvarentId.class)
public class Rhteltvarent {

    /** identifier field */
    @Id
    private String cdos;

    /** identifier field */
    @Id
    private String aamm;

    /** identifier field */
    @Id
    private String nmat;

    /** identifier field */
    @Id
    private Integer nbul;

    /** nullable persistent field */
    private Date ddpa;

    /** nullable persistent field */
    private Date dfpa;

    /** nullable persistent field */
    private String bcmo;
}
