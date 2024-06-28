package com.portfolio_backend.modele;

import jakarta.persistence.*;

@Entity
public class ReseauSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String lien;

    @ManyToOne
    @JoinColumn(name = "profil_id")
    private Profil profil;
}
