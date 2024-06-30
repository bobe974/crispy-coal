package com.portfolio_backend.modele;

import com.portfolio_backend.enums.TagEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<TagEnum> getTags() {
        return tags;
    }

    public void setTags(List<TagEnum> tags) {
        this.tags = tags;
    }

    private String nom;
    private String resume;
    private String description;
    private String link;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;

    @ElementCollection
    private List<String> photos;

//    @ManyToMany
//    @JoinTable(    //JOINTURE 0n 0n donc NOUVELLE ENTITE "projet_tag
//            name = "projet_tag",
//            joinColumns = @JoinColumn(name = "projet_id"),
//            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<TagEnum> tags;
}
