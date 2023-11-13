package com.example.demo14.Controller;

import com.example.demo14.Entite.Stock;
import com.example.demo14.Service.StockServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/Stock")
public class StockController {
    StockServiceImpl stockService;

    @PostMapping("/add")
    @ResponseBody

    public Stock AddStock(Stock s){
      return   stockService.AddStock(s);
    }


   @DeleteMapping("delate/{id}")
    @ResponseBody
    public void DelbyID(@PathVariable Long id){

         stockService.DelStockbyid(id);

    }
}
