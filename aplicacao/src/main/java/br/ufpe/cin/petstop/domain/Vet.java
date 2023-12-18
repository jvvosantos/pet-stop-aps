package br.ufpe.cin.petstop.domain;

import java.util.Date;

import br.ufpe.cin.petstop.enumeration.PetType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Vet extends Customer {

    private static final long serialVersionUID = 1L;

    @Column
    private String license;

    @Column
    private Date admissionDate;

    @Column
    @Enumerated(EnumType.STRING)
    private PetType specialization;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    
    public PetType getSpecialization() {
        return specialization;
    }

    public void setSpecialization(PetType specialization) {
        this.specialization = specialization;
    }
}