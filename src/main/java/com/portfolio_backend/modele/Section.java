package com.portfolio_backend.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomSection;
    private String intitule;
    private String lieu;
    private String dateDebut;
    private String dateFin;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    private List<Tache> taches;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private Cv cv;
}

