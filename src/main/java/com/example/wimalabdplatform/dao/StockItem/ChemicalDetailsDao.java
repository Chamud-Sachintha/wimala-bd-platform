package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChemicalDetailsDao extends JpaRepository<ChemicalDetailsDTO, Integer> {

    @Query("select count(u) from ChemicalDetailsDTO u where u.stock_id = :stockId")
    int getChemicalDetailsCountByStockId(int stockId);
}
