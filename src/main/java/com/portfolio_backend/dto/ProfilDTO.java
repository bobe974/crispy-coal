package com.portfolio_backend.dto;

import com.portfolio_backend.modele.Projet;

import java.util.List;

public class ProfilDTO {
    private String nom;
    private String emploi;
    private String introduction;
    private String aPropos;
    private String photo;
    private String mail;

    private List<Projet> mesProjets;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getEmploi() {
        return emploi;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getaPropos() {
        return aPropos;
    }

    public void setaPropos(String aPropos) {
        this.aPropos = aPropos;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public List<Projet> getMesProjets() {
        return mesProjets;
    }

    public void setMesProjets(List<Projet> mesProjets) {
        this.mesProjets = mesProjets;
    }

}
