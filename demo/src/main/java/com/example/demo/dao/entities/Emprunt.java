package com.example.demo.dao.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "La date d'emprunt ne peut pas être nulle.")
    @PastOrPresent(message = "La date d'emprunt doit être une date passée ou présente.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEmpIrunt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRetourPrevu;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Livre livre;
}
