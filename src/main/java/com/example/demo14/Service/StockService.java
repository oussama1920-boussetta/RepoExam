package com.example.demo14.Service;

import com.example.demo14.Entite.Stock;
import com.example.demo14.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StockService implements StockServiceImpl{
@Autowired
    StockRepository stockRepository;
@Override
    public Stock AddStock(Stock s){

 return   stockRepository.save(s);
    }
    @Override
    public  void DelStockbyid(Long id){
     stockRepository.deleteById(id);

    }
}
