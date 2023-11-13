package com.example.demo14.Service;

import com.example.demo14.Entite.Produit;
import com.example.demo14.Entite.Stock;
import com.example.demo14.Repository.ProduitRepository;
import com.example.demo14.Repository.StockRepository;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class ProduitService implements ProduitServiceImpl{
StockRepository stockRepository;
ProduitRepository produitRepository;
@Override
public Produit GetProduitbyid(@PathVariable Long id){
  produitRepository.findById(id).get();
  return null;
}
    @Override

public Produit AddProduit (Produit p){
 return produitRepository.save(p);
}
    @Override
public List<Produit> getAll(){
 return  ( List<Produit>) produitRepository.findAll();

}
@Override
    public List<Produit> GetProduitbyIdStock(Long idStock){
    var stock = stockRepository.findById(idStock).orElseThrow(()->new RuntimeException("stock introuvable"));
    return produitRepository.findProduitsByStock(stock);
    }
}
