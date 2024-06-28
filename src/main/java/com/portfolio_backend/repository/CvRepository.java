package com.portfolio_backend.repository;

import com.portfolio_backend.modele.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv,Long> {
}
