package com.portfolio_backend.controller;

import com.portfolio_backend.dto.ProfilDTO;
import com.portfolio_backend.dto.ProfilPatchDTO;
import com.portfolio_backend.modele.Profil;
import com.portfolio_backend.services.ProfilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/profil")
public class ProfilController {

    private final ProfilImpl service;

    @Autowired
    public ProfilController(ProfilImpl service) {
        this.service = service;
    }
    @GetMapping
    public ProfilDTO getProfil() {
        return service.recupererProfilDto();
    }
    @PostMapping
    public void createProfil(@RequestBody Profil profil) {
         service.ajouterProfil(profil);
    }
    @PatchMapping("/{id}")
    public  void updateProfil(@PathVariable Long id, @RequestBody ProfilPatchDTO profilDto) {
        service.updateProfil(profilDto, id);
    }

    @DeleteMapping()
    public void deleteProfil(){
        service.deleteProfil();
    }
}