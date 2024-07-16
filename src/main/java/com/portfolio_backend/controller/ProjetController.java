package com.portfolio_backend.controller;

import com.portfolio_backend.modele.Projet;
import com.portfolio_backend.repository.ProjetRepository;
import com.portfolio_backend.services.ProjetImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/projet")
public class ProjetController {

    private final ProjetImpl service;

    public ProjetController(ProjetImpl service) {
        this.service = service;
    }

    @GetMapping()
    public List<Projet> getAllProjects() {
        return service.recupererProjets();
    }

    @GetMapping("/{id}")
    public Projet getProjectById(@PathVariable Long id) {
        return service.recupererParId(id);
    }

    @GetMapping("/last")
    public Projet getLastProjectByDate(){
        return service.recupererRecentProjet();
    }
    @PatchMapping("/{id}")
    public void updateProject(@PathVariable Long id, @RequestBody Projet updatedProject) {
        service.updateProjet(updatedProject,id);
    }

    @PostMapping("")
    public void createProject(@RequestBody Projet newProject) {
         service.ajouterProjet(newProject);
    }
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id){
        service.deleteProject(id);
    }
    @DeleteMapping()
    public void deleteAllProject(){
        service.deleteAllProject();
    }
}
