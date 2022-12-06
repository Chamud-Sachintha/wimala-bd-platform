package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.entity.StockDetailsDTO;
import com.example.wimalabdplatform.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping({"/createNewStock"})
    public boolean createNewStockDetails(@RequestBody StockDetailsDTO stockDetailsDTO) {
        boolean data = this.stockService.createNewStock(stockDetailsDTO);
        return data;
    }

    @GetMapping({"/search/all"})
    public List<StockDetailsDTO> getAllStockDetails() {
        List<StockDetailsDTO> stockDetailsDTOS = null;
        stockDetailsDTOS = this.stockService.getAllStockDetails();

        return stockDetailsDTOS;
    }

    @PutMapping({"/manage"})
    public boolean manageStockDetails(@RequestParam int stockId, @RequestBody StockDetailsDTO newStockDetails) {
        boolean stockDetailsDTO = this.stockService.manageStockDetailsById(stockId, newStockDetails);
        return stockDetailsDTO;
    }

    @DeleteMapping({"/delete"})
    public boolean deleteStockDetailsByStockId(@RequestParam int stockId) {
        boolean stockDetailsDeletion = this.stockService.deleteStockDetailsByStockId(stockId);
        return stockDetailsDeletion;
    }
}
