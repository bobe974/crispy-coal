package com.portfolio_backend.services;

import com.portfolio_backend.dto.ProfilPatchDTO;
import com.portfolio_backend.modele.Profil;
import com.portfolio_backend.modele.Projet;
import com.portfolio_backend.repository.ProfilRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class ProfilImpl {
    private final ProfilRepository profilRepository;

    @Autowired
    public ProfilImpl(ProfilRepository profilRepository){
        this.profilRepository = profilRepository;
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
        profilRepository.save(profil);
    }
}
