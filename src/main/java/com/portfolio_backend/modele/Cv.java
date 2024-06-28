package com.portfolio_backend.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Section> sections;
}

