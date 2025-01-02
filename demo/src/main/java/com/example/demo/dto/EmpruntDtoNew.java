package com.example.demo.dto;

import com.example.demo.dao.entities.Livre;
import com.example.demo.dao.entities.Utilisateur;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EmpruntDtoNew {
    private Long id;
    @NotNull(message = "La date d'emprunt ne peut pas être nulle.")
    @PastOrPresent(message = "La date d'emprunt doit être une date passée ou présente.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEmpIrunt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRetourPrevu;
    private Utilisateur utilisateur;
    private Livre livre;
}
