package com.portfolio_backend.repository;

import com.portfolio_backend.modele.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil,Long> {

}
