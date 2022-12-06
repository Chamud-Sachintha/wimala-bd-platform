package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TobaccoLeavesDao extends JpaRepository<TobaccoLeavesDTO, Integer> {

    @Query("select count(u) from TobaccoLeavesDTO u where u.stock_id = :stockId")
    int getTobaccoLeavesCountByStockId(int stockId);
}
