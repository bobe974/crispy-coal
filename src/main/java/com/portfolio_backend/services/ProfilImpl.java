package com.portfolio_backend.services;

import com.portfolio_backend.dto.ProfilDTO;
import com.portfolio_backend.dto.ProfilPatchDTO;
import com.portfolio_backend.modele.Profil;
import com.portfolio_backend.modele.Projet;
import com.portfolio_backend.repository.ProfilRepository;
import com.portfolio_backend.repository.ProjetRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfilImpl {
    private final ProfilRepository profilRepository;
    private final ProjetRepository projetRepository;

    @Autowired
    public ProfilImpl(ProfilRepository profilRepository, ProjetRepository projetRepository){
        this.profilRepository = profilRepository;
        this.projetRepository = projetRepository;
    }

    public List<Profil> recupererProfil(){
        return profilRepository.findAll();
    }
    public void ajouterProfil(Profil profil){
        if(!Objects.isNull(profil)){
            profilRepository.save(profil);
        }
    }
    public void updateProfil(ProfilPatchDTO updatedProfil, Long id){
        Profil profil = profilRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("profil non trouvé avec id: " + id));
        if (updatedProfil.getNom() != null) {
            profil.setNom(updatedProfil.getNom());
        }
        if (updatedProfil.getEmploi() != null) {
            profil.setEmploi(updatedProfil.getEmploi());
        }
        if (updatedProfil.getIntroduction() != null) {
            profil.setIntroduction(updatedProfil.getIntroduction());
        }
        if (updatedProfil.getaPropos() != null) {
            profil.setaPropos(updatedProfil.getaPropos());
        }
        if (updatedProfil.getPhoto() != null) {
            profil.setPhoto(updatedProfil.getPhoto());
        }
        if (updatedProfil.getMail() != null) {
            profil.setMail(updatedProfil.getMail());
        }
        if (updatedProfil.getGithub()!= null) {
            profil.setGithub(updatedProfil.getGithub());
        }
        if (updatedProfil.getLinkedin() != null) {
            profil.setLinkedin(updatedProfil.getLinkedin());
        }
        profilRepository.save(profil);
    }

    public ProfilDTO recupererProfilDto() {
        List<Profil> profils = profilRepository.findAll();
        if (profils.isEmpty()) {
            throw new NoSuchElementException("Aucun profil trouvé");
        }
        Profil profil = profils.get(0);
        /**TODO TRI A FAIRE SUR LA DATE**/
        List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Order.desc("date")));
        if (projets == null) {
            projets = Collections.emptyList();
        }

//        Projet projet = new Projet();
//        projet.setDescription("llol");
//        projet.setNom("sxxx");
//        projet.setLink("http");
//        projets.add(projet);

        ProfilDTO profilDTO = new ProfilDTO();
        profilDTO.setNom(profil.getNom());
        profilDTO.setMesProjets(projets);
        profilDTO.setPhoto(profil.getPhoto());
        profilDTO.setIntroduction(profil.getIntroduction());
        profilDTO.setMail(profil.getMail());
        profilDTO.setEmploi(profil.getEmploi());
        profilDTO.setaPropos(profil.getaPropos());
        profilDTO.setMesProjets(projets);
        profilDTO.setGithub(profil.getGithub());
        profilDTO.setLinkedin(profil.getLinkedin());
        return profilDTO;
    }
}
