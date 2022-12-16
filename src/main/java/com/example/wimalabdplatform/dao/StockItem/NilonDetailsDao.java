package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NilonDetailsDao extends JpaRepository<NilonDetailsDTO, Integer> {

    @Query("select count(u) from NilonDetailsDTO u where u.stock_id = :stockId")
    int getNilonDetailsCountByStockId(int stockId);

    @Query("SELECT t FROM NilonDetailsDTO t WHERE t.stock_id = :stockId")
    List<NilonDetailsDTO> findNilonDetailsByStockId(int stockId);

    @Query("SELECT t FROM NilonDetailsDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    NilonDetailsDTO findNilondetailsByRefNoAndStockId(int refNo, int stockId);

    @Query("DELETE FROM NilonDetailsDTO t WHERE t.id = :refNo AND t.stock_id = :stocId")
    void deleteNilondetailsByRefNoAndStockId(int refNo, int stockid);
}
