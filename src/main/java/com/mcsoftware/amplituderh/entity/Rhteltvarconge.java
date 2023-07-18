package com.mcsoftware.amplituderh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author c.mbassi */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Rhteltvarconge")
@Table(name = "rhteltvarconge")
@IdClass(RhteltvarcongeId.class)
public class Rhteltvarconge  implements Serializable {

    @Id
    private String cdos;

    @Id
    private String aamm;

    @Id
    private String nmat;

    @Id
    private Integer nbul;

    @Id
    private Date ddeb;

    private Date dfin;

    private BigDecimal nbjc;

    private BigDecimal nbja;

    private String motf;

    private BigDecimal mont;

    private String cuti;

}
