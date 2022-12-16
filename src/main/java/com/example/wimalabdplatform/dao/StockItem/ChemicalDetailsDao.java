package com.example.wimalabdplatform.dao.StockItem;

import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChemicalDetailsDao extends JpaRepository<ChemicalDetailsDTO, Integer> {

    @Query("select count(u) from ChemicalDetailsDTO u where u.stock_id = :stockId")
    int getChemicalDetailsCountByStockId(int stockId);

    @Query("SELECT t FROM ChemicalDetailsDTO t WHERE t.stock_id = :stockId")
    List<ChemicalDetailsDTO> findChemicalDetailsByStockId(int stockId);

    @Query("SELECT t FROM ChemicalDetailsDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    ChemicalDetailsDTO findChemicalDetailsByRefNoAndStockId(int refNo, int stockId);

    @Query("DELETE FROM ChemicalDetailsDTO t WHERE t.id = :refNo AND t.stock_id = :stockId")
    void deleteChemicaldetailsByrefNoAndStockId(int refNo, int stockId);
}
