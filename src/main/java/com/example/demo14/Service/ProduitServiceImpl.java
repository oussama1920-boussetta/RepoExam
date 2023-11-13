package com.example.demo14.Service;

import com.example.demo14.Entite.Produit;
import com.example.demo14.Entite.Stock;

import java.util.List;

public interface ProduitServiceImpl {
    Produit AddProduit(Produit p);
   Produit GetProduitbyid(Long id);
   List<Produit> getAll();
   List<Produit> GetProduitbyIdStock(Long idStock);
}
