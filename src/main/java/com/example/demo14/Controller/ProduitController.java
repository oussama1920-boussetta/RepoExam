package com.example.demo14.Controller;

import com.example.demo14.Entite.Produit;
import com.example.demo14.Entite.Stock;
import com.example.demo14.Service.ProduitServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Produit")
public class ProduitController {

    ProduitServiceImpl produitService;

    @PostMapping("/add")
    @ResponseBody
    public Produit AddProduit(@RequestBody Produit p){
        if(p == null)
            return null;
        return produitService.AddProduit(p);
    }


    @GetMapping("/{id}")
    public Produit GetProduitbyid(@PathVariable Long id ) {
        return       produitService.GetProduitbyid(id);

    }
    @GetMapping("/getAll")
    @ResponseBody
        public List<Produit> getAll(){
        return     produitService.getAll();
        }


    @GetMapping("/getbyidStock/{idStock}")
    public List<Produit> GetProduitbyIdStock(@PathVariable Long idStock){
       return produitService.GetProduitbyIdStock(idStock);
        }
}
