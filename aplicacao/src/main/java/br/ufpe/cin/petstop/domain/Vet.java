package br.ufpe.cin.petstop.domain;

import java.util.Date;

import br.ufpe.cin.petstop.enumeration.PetType;

public class Vet extends User {

    private static final long serialVersionUID = 1L;

    private String license;

    private Date admissionDate;

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