package com.mcsoftware.amplituderh.dto;

import com.mcsoftware.amplituderh.entity.Rhteltvarconge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElementVarCongeDto {

    @NotNull(message = "Le dossier ne doit pas etre vide")
    @NotEmpty(message = "Le dossier ne doit pas etre vide")
    @NotBlank(message = "Le dossier ne doit pas etre vide")
    private String cdos;

    @NotNull(message = "La période ne doit pas etre vide")
    @NotEmpty(message = "La période ne doit pas etre vide")
    @NotBlank(message = "La période ne doit pas etre vide")
    private String aamm;

    @NotNull(message = "Le matricule ne doit pas etre vide")
    @NotEmpty(message = "Le matricule ne doit pas etre vide")
    @NotBlank(message = "Le matricule ne doit pas etre vide")
    private String nmat;

    @NotNull(message = "Le numéro de bulletin ne doit pas etre vide")
    private Integer nbul;

    @NotNull(message = "La date de début ne doit pas etre vide")
    private Date ddeb;

    @NotNull(message = "La date de fin ne doit pas etre vide")
    private Date dfin;

    @NotNull(message = "Le nombre de jour de congé ne doit pas etre vide")
    private BigDecimal nbjc;

    @NotNull(message = "Le nombre de jour d'absence ne doit pas etre vide")
    private BigDecimal nbja;

    @NotNull(message = "Le motif ne doit pas etre vide")
    @NotEmpty(message = "Le motif ne doit pas etre vide")
    @NotBlank(message = "Le motif ne doit pas etre vide")
    private String motf;

    private BigDecimal mont;

    @NotNull(message = "Le code utilisateur ne doit pas etre vide")
    @NotEmpty(message = "Le code utilisateur ne doit pas etre vide")
    @NotBlank(message = "Le code utilisateur ne doit pas etre vide")
    private String cuti;

    private String estUnCOnge = "N";
    private BigDecimal nbjcTotal;
    private BigDecimal nbjaTotal;
    private Date minDeb;
    private Date maxFin;
    private Date firstDay;
    private Date lastDay;

    public static ElementVarCongeDto fromEntity(Rhteltvarconge absenceConge) {
        if (absenceConge == null) {
            return null;
        }

        ElementVarCongeDto dto = new ElementVarCongeDto();
        BeanUtils.copyProperties(absenceConge, dto);

        return dto;
    }

    public static Rhteltvarconge toEntity(ElementVarCongeDto dto) {
        if (dto == null) {
            return null;
        }

        Rhteltvarconge entity = new Rhteltvarconge();
        BeanUtils.copyProperties(dto, entity);

        return entity;
    }

}
