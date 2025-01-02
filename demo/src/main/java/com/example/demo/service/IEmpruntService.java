package com.example.demo.service;

import com.example.demo.dto.EmpruntDto;
import com.example.demo.dto.EmpruntDtoNew;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmpruntService {
    EmpruntDto addEmprunt(EmpruntDtoNew empruntDtoNew);
    Page<EmpruntDto> getAllEmprunts(Long utilisateurId, Pageable pageable);
}
