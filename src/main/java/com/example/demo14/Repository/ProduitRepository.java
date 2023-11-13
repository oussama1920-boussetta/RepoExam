package com.example.demo14.Repository;

import com.example.demo14.Entite.Produit;
import com.example.demo14.Entite.Stock;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProduitRepository extends CrudRepository<Produit, Long> {

    List<Produit> findProduitsByStock(Stock stock);
}
