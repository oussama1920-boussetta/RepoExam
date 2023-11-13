package com.example.demo14.Repository;

import com.example.demo14.Entite.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Long> {
}
