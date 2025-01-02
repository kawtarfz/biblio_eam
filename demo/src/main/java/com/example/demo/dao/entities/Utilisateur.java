package com.example.demo.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    private Collection<Emprunt> Emprunts;
    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    private Collection<Livre> livres;


}
