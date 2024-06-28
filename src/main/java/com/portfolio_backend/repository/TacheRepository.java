package com.portfolio_backend.repository;

import com.portfolio_backend.modele.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository  extends JpaRepository<Tache,Long> {
}
