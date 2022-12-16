package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TobaccoLeavesDao extends JpaRepository<TobaccoLeavesDTO, Integer> {

    @Query("select count(u) from TobaccoLeavesDTO u where u.stock_id = :stockId")
    int getTobaccoLeavesCountByStockId(int stockId);

    @Query("SELECT t FROM TobaccoLeavesDTO t WHERE t.stock_id = :stockId")
    List<TobaccoLeavesDTO> frindTobaccoLeavesByStockId(int stockId);

    @Query("SELECT t FROM TobaccoLeavesDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    TobaccoLeavesDTO findTobaccoLeavesByRefNoAndStockId(int refNo, int stockId);

    @Query("DELETE FROM TobaccoLeavesDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    void deleteTobaccoLeavesByRefNoAndStockId(int refNo,int stockId);
}
