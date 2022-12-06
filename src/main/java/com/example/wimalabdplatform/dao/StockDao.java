package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.StockDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDao extends JpaRepository<StockDetailsDTO, Integer> {
}
