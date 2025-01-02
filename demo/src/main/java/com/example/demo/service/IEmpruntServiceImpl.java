package com.example.demo.service;

import com.example.demo.Mapper.EmpruntMapper;
import com.example.demo.dao.repositories.EmpruntRepository;
import com.example.demo.dao.repositories.UtilisateurRepository;
import com.example.demo.dto.EmpruntDto;
import com.example.demo.dto.EmpruntDtoNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IEmpruntServiceImpl implements IEmpruntService {
    @Autowired
    private EmpruntMapper empruntMapper;

    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override

    public Page<EmpruntDto> getAllEmprunts(Long utilisateurId, Pageable pageable){
        return empruntRepository.findByUtilisateurId(utilisateurId, pageable)
                .map(empruntMapper::fromEMPToEMPDto);

    }



    @Override
    public EmpruntDto addEmprunt(EmpruntDtoNew empruntDtoNew) {
        return empruntMapper.fromEMPToEMPDto(empruntRepository.save(empruntMapper.fromEMPDtoNewToEMP(empruntDtoNew)))
                ;
    }
}


