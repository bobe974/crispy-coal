package com.portfolio_backend.repository;

import com.portfolio_backend.modele.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
