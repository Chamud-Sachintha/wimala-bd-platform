package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NilonDetailsDao extends JpaRepository<NilonDetailsDTO, Integer> {

    @Query("select count(u) from NilonDetailsDTO u where u.stock_id = :stockId")
    int getNilonDetailsCountByStockId(int stockId);
}
