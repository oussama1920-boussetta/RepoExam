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
@Table(name = "Stock")
public class Stock  implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStock")
    private Long idStock;
    @Column(name = "qte")
    private int qte;
    @Column(name = "qteMin")
    private int qteMin;
    @Column(name = "libelleStock")
    private String libelleStock;

@OneToMany(mappedBy = "stock")
    List<Produit> produits;
}
