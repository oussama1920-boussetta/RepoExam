package com.example.demo14.Entite;


import com.example.demo14.CategorieProduit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "DetailProduit")
public class DetailProduit implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailProduit")
    private Long idDetailProduit;
    @Column(name = "DateCreation")
    private Date DateCreation;
    @Column(name = "DateDerniereModification")
    private Date DateDerniereModification;
    @Column(name = "CategorieProduit")
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;
}
