package com.example.demo.Mapper;

import com.example.demo.dao.entities.Emprunt;
import com.example.demo.dto.EmpruntDto;
import com.example.demo.dto.EmpruntDtoNew;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpruntMapper {
    ModelMapper mapper = new ModelMapper();

    public EmpruntDto fromEMPToEMPDto(Emprunt emprunt){

        return mapper.map(emprunt, EmpruntDto.class);
    }

    public Emprunt fromEMPDtoToEMP(EmpruntDto emprunt){

        return mapper.map(emprunt, Emprunt.class);
    }

    public Emprunt fromEMPDtoNewToEMP(EmpruntDtoNew emprunt){

        return mapper.map(emprunt,Emprunt.class);
    }

}
