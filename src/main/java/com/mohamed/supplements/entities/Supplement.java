package com.mohamed.supplements.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Supplement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupplement;
    private String nomSupplement;
    private Double prixSupplement;
    private Double dosageSupplement;

    private Date dateCreation;
    @ManyToOne
    private Nutritional nutritional ;
 
    // Default constructor
    public Supplement() {
        super();
    }

    // Parameterized constructor
    public Supplement(String nomSupplement, Double prixSupplement,  Double dosageSupplement,Date dateCreation) {
        super();
        this.nomSupplement = nomSupplement;
        this.prixSupplement = prixSupplement;
        this.dosageSupplement = dosageSupplement;
        this.dateCreation = dateCreation;
  
        
    }





    // Getters and Setters
    public Long getIdSupplement() {
        return idSupplement;
    }

    public void setIdSupplement(Long idSupplement) {
        this.idSupplement = idSupplement;
    }

    public String getNomSupplement() {
        return nomSupplement;
    }

    public void setNomSupplement(String nomSupplement) {
        this.nomSupplement = nomSupplement;
    }

    public Double getPrixSupplement() {
        return prixSupplement;
    }

    public void setPrixSupplement(Double prixSupplement) {
        this.prixSupplement = prixSupplement;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Double getDosageSupplement() {
        return dosageSupplement;
    }

    public void setDosageSupplement(Double dosageSupplement) {
        this.dosageSupplement = dosageSupplement;
    }
    public Nutritional getNutritional() {
        return nutritional;
    }

    public void setNutritional(Nutritional nutritional) {
        this.nutritional = nutritional;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Supplement [idSupplement=" + idSupplement + ", nomSupplement=" + nomSupplement 
               + ", prixSupplement=" + prixSupplement + 
                ", dosageSupplement=" + dosageSupplement + ", dateCreation=" + dateCreation +"]";
    }
}
