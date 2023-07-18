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
@Entity(name = "Rhpagent")
@Table(name = "rhpagent")
@IdClass(RhpagentId.class)
public class Rhpagent  implements Serializable {

    /** identifier field */
    @Id
    private String cdos;

    /** identifier field */
    @Id
    private String nmat;

    /** nullable persistent field */
    private String niv1;

    /** nullable persistent field */
    private String niv2;

    /** nullable persistent field */
    private String niv3;

    /** nullable persistent field */
    private String cals;

    /** nullable persistent field */
    private String clas;

    /** nullable persistent field */
    private String nom;

    /** nullable persistent field */
    private String pren;

    /** nullable persistent field */
    private String sexe;

    /** nullable persistent field */
    private Date dtna;

    /** nullable persistent field */
    private String nato;

    /** nullable persistent field */
    private String sitf;

    /** nullable persistent field */
    private Integer nbcj;

    /** nullable persistent field */
    private Integer nbef;

    /** nullable persistent field */
    private Integer nbec;

    /** nullable persistent field */
    private Integer nbfe;

    /** nullable persistent field */
    private BigDecimal nbpt;

    /** nullable persistent field */
    private String modp;

    /** nullable persistent field */
    private String banq;

    /** nullable persistent field */
    private String guic;

    /** nullable persistent field */
    private String comp;

    /** nullable persistent field */
    private String cle;

    /** nullable persistent field */
    private String ccpt;

    /** nullable persistent field */
    private String bqso;

    /** nullable persistent field */
    private String vild;

    /** nullable persistent field */
    private Date dcre;

    /** nullable persistent field */
    private Date dmaj;

    /** nullable persistent field */
    private String cat;

    /** nullable persistent field */
    private String ech;

    /** nullable persistent field */
    private String grad;

    /** nullable persistent field */
    private String fonc;

    /** nullable persistent field */
    private String afec;

    /** nullable persistent field */
    private String codf;

    /** nullable persistent field */
    private Integer indi;

    /** nullable persistent field */
    private String ctat;

    /** nullable persistent field */
    private BigDecimal tinp;

    /** nullable persistent field */
    private String synd;

    /** nullable persistent field */
    private String hifo;

    /** nullable persistent field */
    private String zli1;

    /** nullable persistent field */
    private String zli2;

    /** nullable persistent field */
    private Date dtes;

    /** nullable persistent field */
    private Date ddca;

    /** nullable persistent field */
    private String typc;

    /** nullable persistent field */
    private String avn1;

    /** nullable persistent field */
    private String avn2;

    /** nullable persistent field */
    private String avn3;

    /** nullable persistent field */
    private String avn4;

    /** nullable persistent field */
    private String avn5;

    /** nullable persistent field */
    private String avn6;

    /** nullable persistent field */
    private String avn7;

    /** nullable persistent field */
    private String regi;

    /** nullable persistent field */
    private String zres;

    /** nullable persistent field */
    private String dmst;

    /** nullable persistent field */
    private Integer npie;

    /** nullable persistent field */
    private String mrrx;

    /** nullable persistent field */
    private Date dmrr;

    /** nullable persistent field */
    private String mtfr;

    /** nullable persistent field */
    private String lieu;

    /** nullable persistent field */
    private String cods;

    /** nullable persistent field */
    private String pnet;

    /** nullable persistent field */
    private BigDecimal snet;

    /** nullable persistent field */
    private String devp;

    /** nullable persistent field */
    private String equi;

    /** nullable persistent field */
    private String dels;

    /** nullable persistent field */
    private String tits;

    /** nullable persistent field */
    private Date dtit;

    /** nullable persistent field */
    private Date depr;

    /** nullable persistent field */
    private Date decc;

    /** nullable persistent field */
    private BigDecimal japa;

    /** nullable persistent field */
    private BigDecimal dapa;

    /** nullable persistent field */
    private BigDecimal japec;

    /** nullable persistent field */
    private BigDecimal dapec;

    /** nullable persistent field */
    private BigDecimal jded;

    /** nullable persistent field */
    private BigDecimal dded;

    /** nullable persistent field */
    private BigDecimal jrla;

    /** nullable persistent field */
    private BigDecimal jrlec;

    /** nullable persistent field */
    private BigDecimal nbjcf;

    /** nullable persistent field */
    private BigDecimal nbjaf;

    /** nullable persistent field */
    private Date ddcf;

    /** nullable persistent field */
    private Date dfcf;

    /** nullable persistent field */
    private BigDecimal mtcf;

    /** nullable persistent field */
    private String pmcf;

    /** nullable persistent field */
    private BigDecimal nbjse;

    /** nullable persistent field */
    private BigDecimal nbjsa;

    /** nullable persistent field */
    private String nmjf;

    /** nullable persistent field */
    private String adr1;

    /** nullable persistent field */
    private String adr2;

    /** nullable persistent field */
    private String adr3;

    /** nullable persistent field */
    private String adr4;

    /** nullable persistent field */
    private String bpos;

    /** nullable persistent field */
    private String ntel;

    /** nullable persistent field */
    private String pnai;

    /** nullable persistent field */
    private String comm;

    /** nullable persistent field */
    private String pbpe;

    /** nullable persistent field */
    private Date dchg;

    /** nullable persistent field */
    private String mchg;

    /** nullable persistent field */
    private Date dfes;

    /** nullable persistent field */
    private String stor;

    /** nullable persistent field */
    private BigDecimal nbjtr;

    /** nullable persistent field */
    private Date drtcg;

    /** nullable persistent field */
    private Date ddenv;

    /** nullable persistent field */
    private Date drenv;

    /** nullable persistent field */
    private String noss;

    /** nullable persistent field */
    private String cont;

    /** nullable persistent field */
    private BigDecimal nbjsm;

    /** nullable persistent field */
    private String sana;

    /** nullable persistent field */
    private String tyfo1;

    /** nullable persistent field */
    private String tyfo2;

    /** nullable persistent field */
    private String nifo;

    /** nullable persistent field */
    private Date dchf;

    /** nullable persistent field */
    private String note;

    /** nullable persistent field */
    private String codeposte;

    /** nullable persistent field */
    private String codesite;

    /** nullable persistent field */
    private String zli3;

    /** nullable persistent field */
    private String zli4;

    /** nullable persistent field */
    private String zli5;

    /** nullable persistent field */
    private String zli6;

    /** nullable persistent field */
    private String zli7;

    /** nullable persistent field */
    private String zli8;

    /** nullable persistent field */
    private String zli9;

    /** nullable persistent field */
    private String zli10;

    /** nullable persistent field */
    private String lnai;

    /** nullable persistent field */
    private String lemb;

}
