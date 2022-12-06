package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WrapingLeavesDao extends JpaRepository<WrappingLeavesDTO, Integer> {

    @Query("select count(u) from WrappingLeavesDTO u where u.stock_id = :stockId")
    int getWrappingLeavesCountByStockId(int stockId);
}
