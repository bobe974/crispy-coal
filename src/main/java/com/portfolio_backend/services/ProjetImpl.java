package com.portfolio_backend.services;

import com.portfolio_backend.modele.Projet;
import com.portfolio_backend.repository.ProjetRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProjetImpl {

    private final ProjetRepository projetRepository;
    @Autowired
    public ProjetImpl(ProjetRepository projetRepository){
        this.projetRepository =projetRepository;
    }

    public List<Projet> recupererProjets(){
        return  projetRepository.findAll();
    }

    public Projet recupererParId(Long id){
        Optional<Projet> optionalProjet = projetRepository.findById(id);
        return optionalProjet.orElseThrow(() -> new NoSuchElementException("Projet avec ID " + id + " non trouvé"));
    }

    public void ajouterProjet(Projet projet){
        projetRepository.save(projet);
    }

    public void updateProjet(Projet updatedProjet, Long id){
        Projet projet1 = projetRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("projet non trouvé avec id: " + id));
        if (updatedProjet.getNom() != null) {
            projet1.setNom(updatedProjet.getNom());
        }

        if (updatedProjet.getResume() != null) {
            projet1.setResume(updatedProjet.getResume());
        }
        if (updatedProjet.getTags() != null) {
            projet1.setTags(updatedProjet.getTags());
        }

        if (updatedProjet.getDescription() != null) {
            projet1.setDescription(updatedProjet.getDescription());
        }

        if (updatedProjet.getLink() != null) {
            projet1.setLink(updatedProjet.getLink());
        }

        if (updatedProjet.getDate() != null) {
            projet1.setDate(updatedProjet.getDate());
        }
        projetRepository.save(projet1);
    }

}
