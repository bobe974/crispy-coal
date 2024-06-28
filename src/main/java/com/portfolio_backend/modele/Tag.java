package com.portfolio_backend.modele;

import com.portfolio_backend.modele.Projet;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String couleur;

    @ManyToMany(mappedBy = "tags")
    private List<Projet> projets;

}
