package com.example.demo.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String auteur;
    private Date datePublication;
    private Integer isbn;
    private StatutLivre status;
    @OneToMany(mappedBy = "livre",fetch = FetchType.LAZY)
    private Collection<Emprunt> Emprunts;
    @ManyToOne
    private Emprunt emprunt;
    @ManyToOne
    private  Utilisateur utilisateur;

}
