package com.example.demo14.Entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduit")
    private Long idProduit;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "prixUnitaire")
    private float prixUnitaire;

@ManyToOne(cascade = CascadeType.ALL)
private Stock stock;
}
