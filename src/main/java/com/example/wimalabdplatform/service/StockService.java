package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.StockDao;
import com.example.wimalabdplatform.entity.StockDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockDao stockDao;

    public boolean createNewStock(StockDetailsDTO newStockDetails) {
        try {
            newStockDetails.setCreatedDate(new Date());
            StockDetailsDTO stockDetailsDTO = this.stockDao.save(newStockDetails);

            if (stockDetailsDTO != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occur While Create Stock");
        }
    }

    public List<StockDetailsDTO> getAllStockDetails() {
        List<StockDetailsDTO> stockDetailsDTOS = null;
        try {
             stockDetailsDTOS = this.stockDao.findAll();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occur While Geting Stocks.");
        }

        return stockDetailsDTOS;
    }

    public boolean manageStockDetailsById(int stockId, StockDetailsDTO newStockDetails) {
        if (validateStockId(stockId) == true) {
            Optional<StockDetailsDTO> stockDetailsDTO = this.stockDao.findById(stockId);
            stockDetailsDTO.get().setStockName(newStockDetails.getStockName());
            stockDetailsDTO.get().setDescription(newStockDetails.getDescription());

            try {
                this.stockDao.save(stockDetailsDTO.get());
                return true;
            } catch (Exception e) {
                throw new RuntimeException("Error Occured" + e.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean deleteStockDetailsByStockId(int stockId) {
        try {
            this.stockDao.deleteById(stockId);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured " + e.getMessage());
        }
    }

    private boolean validateStockId(int stockId) {
        Optional<StockDetailsDTO> stockDetailsDTO = null;
        try {
            stockDetailsDTO = this.stockDao.findById(stockId);

            if (stockDetailsDTO.get() == null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured while Getting Data.");
        }
    }
}
