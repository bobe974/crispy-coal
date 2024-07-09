package com.portfolio_backend.dto;

import com.portfolio_backend.modele.Projet;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class ProfilDTO {
    private Long id;
    private String nom;
    private String emploi;
    private String introduction;
    private String aPropos;
    private String photo;
    private String mail;
    private String github;
    private String linkedin;

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
