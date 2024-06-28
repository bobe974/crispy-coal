package com.portfolio_backend.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String resume;
    private String description;

    @ElementCollection
    private List<String> photos;

    @ManyToMany
    @JoinTable(    //JOINTURE 0n 0n donc NOUVELLE ENTITE "projet_tag
            name = "projet_tag",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;
}
