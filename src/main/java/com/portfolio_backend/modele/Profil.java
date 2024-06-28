package com.portfolio_backend.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String emploi;
    private String introduction;
    private String aPropos;
    private String photo;
    private String mail;

    @OneToMany(mappedBy = "profil", cascade = CascadeType.ALL)
    private List<ReseauSocial> reseauxSociaux;
}
