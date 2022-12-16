package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WrapingLeavesDao extends JpaRepository<WrappingLeavesDTO, Integer> {

    @Query("select count(u) from WrappingLeavesDTO u where u.stock_id = :stockId")
    int getWrappingLeavesCountByStockId(int stockId);

    @Query("SELECT t FROM WrappingLeavesDTO t WHERE t.stock_id = :stockId")
    List<WrappingLeavesDTO> findAllWrappingLeavesByStockId(int stockId);

    @Query("SELECT t FROM WrappingLeavesDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    WrappingLeavesDTO findWrappingLeavesByRefNoAndStockId(int refNo, int stockId);

    @Query("DELETE FROM WrappingLeavesDTO t WHERE t.id = :refNo AND t.stock_id= :stockId")
    void deleteWrappingLeavesByRefNoAndStockId(int refNo, int stockId);
}
