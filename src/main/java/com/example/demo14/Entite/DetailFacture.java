package com.example.demo14.Entite;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="DetailFacture" )
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDetailFacture")
    private Long idDetailFacture;
    @Column(name = "qte")
    private int qte;
    @Column(name = "prixTotal")
    private float prixTotal;
    @Column(name = "pourcentagereamise")
    private int pourcentagereamise;
    @Column(name = "montantRemise")
    private float montantRemise;

}
