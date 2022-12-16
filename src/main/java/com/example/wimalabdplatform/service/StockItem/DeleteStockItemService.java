package com.example.wimalabdplatform.service.StockItem;

import com.example.wimalabdplatform.dao.StockItem.ChemicalDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.NilonDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.TobaccoLeavesDao;
import com.example.wimalabdplatform.dao.StockItem.WrapingLeavesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStockItemService {

    @Autowired
    private WrapingLeavesDao wrapingLeavesDao;

    @Autowired
    private TobaccoLeavesDao tobaccoLeavesDao;

    @Autowired
    private NilonDetailsDao nilonDetailsDao;

    @Autowired
    private ChemicalDetailsDao chemicalDetailsDao;

    public boolean deleteWrappingleavesByRefNoAndStockId(int refNo, int stockId) {
        try {
            this.wrapingLeavesDao.deleteWrappingLeavesByRefNoAndStockId(refNo, stockId);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is an Erfror Occur " + e.getMessage());
        }
    }

    public boolean deleteTobaccoLeavesByrefNoAndStockId(int refNo, int stockId) {
        try {
            this.tobaccoLeavesDao.deleteTobaccoLeavesByRefNoAndStockId(refNo, stockId);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occr " + e.getMessage());
        }
    }

    public boolean deleteNilonDetailsByRefNoAndStockId(int refNo, int stockId) {
        try {
            this.nilonDetailsDao.deleteNilondetailsByRefNoAndStockId(refNo, stockId);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is and Error Occur " + e.getMessage());
        }
    }

    public boolean deleteChemicaldetailsByrefNoAndStockId(int refNo, int stockId) {
        try {
            this.chemicalDetailsDao.deleteChemicaldetailsByrefNoAndStockId(refNo, stockId);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occur " + e.getMessage());
        }
    }
}
