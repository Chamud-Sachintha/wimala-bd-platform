package com.example.wimalabdplatform.service.StockItem;

import com.example.wimalabdplatform.dao.StockItem.ChemicalDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.NilonDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.TobaccoLeavesDao;
import com.example.wimalabdplatform.dao.StockItem.WrapingLeavesDao;
import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManageStockItemService {

    @Autowired
    private WrapingLeavesDao wrapingLeavesDao;

    @Autowired
    private TobaccoLeavesDao tobaccoLeavesDao;

    @Autowired
    private NilonDetailsDao nilonDetailsDao;

    @Autowired
    private ChemicalDetailsDao chemicalDetailsDao;

    public WrappingLeavesDTO updateWrappingLeavesByStockIdAndId(int refNo, int stockId, WrappingLeavesDTO wrappingLeavesDTO) {
        WrappingLeavesDTO wrappingLeavesDTO1 = null;

        try {
            wrappingLeavesDTO1 = this.wrapingLeavesDao.findWrappingLeavesByRefNoAndStockId(refNo, stockId);
            wrappingLeavesDTO1.setLeaveType(wrappingLeavesDTO.getLeaveType());
            wrappingLeavesDTO1.setStockId(wrappingLeavesDTO.getStockId());
            wrappingLeavesDTO1.setCreatedDate(wrappingLeavesDTO.getCreatedDate());
            wrappingLeavesDTO1.setQuantity(wrappingLeavesDTO.getQuantity());
            wrappingLeavesDTO1.setUnitPrice(wrappingLeavesDTO.getUnitPrice());

            return this.wrapingLeavesDao.save(wrappingLeavesDTO1);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occured " + e.getMessage());
        }
    }

    public TobaccoLeavesDTO updateTobaccoLeavesByRefNoAndStockId(int refNo, int stockId, TobaccoLeavesDTO tobaccoLeavesDTO) {
        TobaccoLeavesDTO tobaccoLeavesDTO1 = null;

        try {
            tobaccoLeavesDTO1 = this.tobaccoLeavesDao.findTobaccoLeavesByRefNoAndStockId(refNo, stockId);
            tobaccoLeavesDTO1.setTobaccoType(tobaccoLeavesDTO.getTobaccoType());
            tobaccoLeavesDTO1.setQuantity(tobaccoLeavesDTO.getQuantity());
            tobaccoLeavesDTO1.setPrice(tobaccoLeavesDTO.getPrice());
            tobaccoLeavesDTO1.setDate(tobaccoLeavesDTO.getDate());

            return this.tobaccoLeavesDao.save(tobaccoLeavesDTO1);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occured " + e.getMessage());
        }
    }

    public NilonDetailsDTO updateNilonDetailsByRefNoAndStockId(int refNo, int stockId, NilonDetailsDTO nilonDetailsDTO) {
        NilonDetailsDTO nilonDetailsDTO1 = null;

        try {
            nilonDetailsDTO1 = this.nilonDetailsDao.findNilondetailsByRefNoAndStockId(refNo, stockId);
            nilonDetailsDTO1.setNilonType(nilonDetailsDTO.getNilonType());
            nilonDetailsDTO1.setQuantity(nilonDetailsDTO.getQuantity());
            nilonDetailsDTO1.setPrice(nilonDetailsDTO.getPrice());
            nilonDetailsDTO1.setDate(nilonDetailsDTO.getDate());

            return this.nilonDetailsDao.save(nilonDetailsDTO1);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occured " + e.getMessage());
        }
    }

    public ChemicalDetailsDTO updateChemicalDetailsByRefNoAndStockId(int refNo, int stockId, ChemicalDetailsDTO chemicalDetailsDTO) {
        ChemicalDetailsDTO chemicalDetailsDTO1 = null;

        try {
            chemicalDetailsDTO1 = this.chemicalDetailsDao.findChemicalDetailsByRefNoAndStockId(refNo, stockId);
            chemicalDetailsDTO1.setChemicalName(chemicalDetailsDTO.getChemicalName());
            chemicalDetailsDTO1.setChemicalType(chemicalDetailsDTO.getChemicalType());
            chemicalDetailsDTO1.setQuantity(chemicalDetailsDTO.getQuantity());
            chemicalDetailsDTO1.setPrice(chemicalDetailsDTO.getPrice());
            chemicalDetailsDTO1.setDate(chemicalDetailsDTO.getDate());

            return this.chemicalDetailsDao.save(chemicalDetailsDTO1);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occured " + e.getMessage());
        }
    }
}
