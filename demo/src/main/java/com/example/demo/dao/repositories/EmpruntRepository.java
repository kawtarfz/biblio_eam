package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Emprunt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends JpaRepository<Emprunt,Long> {
    Page<Emprunt> findByUtilisateurId(Long utilisateurId, Pageable pageable);

}
