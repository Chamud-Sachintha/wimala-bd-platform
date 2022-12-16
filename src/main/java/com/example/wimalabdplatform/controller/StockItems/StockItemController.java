package com.example.wimalabdplatform.controller.StockItems;

import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import com.example.wimalabdplatform.service.StockItem.StockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/stockItems")
public class StockItemController {

    @Autowired
    private StockItemService stockItemService;

    @PostMapping({"/addNewWrappingLeaveSet"})
    public WrappingLeavesDTO addNewWrappingLeaveSet(@RequestBody WrappingLeavesDTO wrappingLeavesDTO) {
        WrappingLeavesDTO wrappingLeavesDTO1 = null;
        wrappingLeavesDTO1 = this.stockItemService.addNewWrappingLeavesSet(wrappingLeavesDTO);

        return wrappingLeavesDTO1;
    }

    @PostMapping({"/addNewTobaccoLeaveSet"})
    public TobaccoLeavesDTO addNewTobaccoLeaveSet(@RequestBody TobaccoLeavesDTO tobaccoLeavesDTO) {
        TobaccoLeavesDTO tobaccoLeavesDTO1 = null;
        tobaccoLeavesDTO1 = this.stockItemService.addNewTobaccoLeaveSet(tobaccoLeavesDTO);

        return tobaccoLeavesDTO1;
    }

    @PostMapping({"/addNewNilonSet"})
    public NilonDetailsDTO addNewNilonSet(@RequestBody NilonDetailsDTO nilonDetailsDTO) {
        NilonDetailsDTO nilonDetailsDTO1 = null;
        nilonDetailsDTO1 = this.stockItemService.addNewNilonSet(nilonDetailsDTO);

        return nilonDetailsDTO1;
    }

    @PostMapping({"/addNewChemicalDetailsSet"})
    public ChemicalDetailsDTO addNewChemicalDetailsSet(@RequestBody ChemicalDetailsDTO chemicalDetailsDTO) {
        ChemicalDetailsDTO chemicalDetailsDTO1 = null;
        chemicalDetailsDTO1 = this.stockItemService.addNewChemicalSet(chemicalDetailsDTO);

        return chemicalDetailsDTO1;
    }

    @GetMapping({"/getWrappingLeavesByStockId"})
    public List<WrappingLeavesDTO> getWrappingLeavesByStockId(@RequestParam int stockId) {
        List<WrappingLeavesDTO> wrappingLeavesDTO = null;

        try {
            wrappingLeavesDTO = this.stockItemService.getWrappingLeavesBySockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("Tere is An Error Occur " + e.getMessage());
        }

        return wrappingLeavesDTO;
    }

    @GetMapping({"/getTobaccoLeavesDetailsByStockId"})
    public List<TobaccoLeavesDTO> getTobaccoLeavesDetailsByStockId(@RequestParam int stockId) {
        List<TobaccoLeavesDTO> tobaccoLeavesDTO = null;

        try {
            tobaccoLeavesDTO = this.stockItemService.getTobaccoLeavesByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("Tere is An Error Occur " + e.getMessage());
        }

        return tobaccoLeavesDTO;
    }

    @GetMapping({"/getNilonDetailsByStockId"})
    public List<NilonDetailsDTO> getNilonDetailsByStockId(@RequestParam int stockId) {
        List<NilonDetailsDTO> nilonDetailsDTO = null;

        try {
            nilonDetailsDTO = this.stockItemService.getNilonDetailsByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("Tere is An Error Occur " + e.getMessage());
        }

        return nilonDetailsDTO;
    }

    @GetMapping({"/getChemicalDetailsByStockId"})
    public List<ChemicalDetailsDTO> getChemicalDetailsByStockId(@RequestParam int stockId) {
        List<ChemicalDetailsDTO> chemicalDetailsDTO = null;

        try {
            chemicalDetailsDTO = this.stockItemService.getChemicalDetailsByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occur " + e.getMessage());
        }

        return chemicalDetailsDTO;
    }

    @GetMapping({"/getwrappingLeaveStockCountByStockId"})
    public int getwrappingLeaveStockCountByStockId(@RequestParam int stockId) {
        int wrappingLeavesCount = this.stockItemService.getwrappingLeaveStockCountByStockId(stockId);
        return wrappingLeavesCount;
    }

    @GetMapping({"/getTobaccoLeaveStockCountByStockId"})
    public int getTobaccoLeaveStockCountByStockId(@RequestParam int stockId) {
        int tobaccoLeavesCount = this.stockItemService.getTobaccoLeavesCountByStockId(stockId);
        return tobaccoLeavesCount;
    }

    @GetMapping({"/getNilonDetailsCountByStockId"})
    public int getNilonDetailsCountByStockId(@RequestParam int stockId) {
        int nilonDetailsCount = this.stockItemService.getNilonDetailsCountByStockId(stockId);
        return nilonDetailsCount;
    }

    @GetMapping({"/getChemicalDetailsCountByStockId"})
    public int getChemicalDetailsCountByStockId(@RequestParam int stockId) {
        int chemicalDetailsCount = this.stockItemService.getChemicalDetailsCountByStockId(stockId);
        return chemicalDetailsCount;
    }

    @GetMapping({"/getWrappingLeavesByRefNoAndStockId"})
    public WrappingLeavesDTO getWrappingLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        WrappingLeavesDTO wrappingLeavesDTO = this.stockItemService.getWrappingLeavesByRefNoAndStockId(refNo, stockId);
        return wrappingLeavesDTO;
    }

    @GetMapping({"/getTobaccoLeavesByRefNoAndStockId"})
    public TobaccoLeavesDTO getTobaccoLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        TobaccoLeavesDTO tobaccoLeavesDTO = this.stockItemService.getTobaccoLeavesByRefNoAndStockId(refNo, stockId);
        return tobaccoLeavesDTO;
    }

    @GetMapping({"/getNilonDetailsByRefNoAndStockId"})
    public NilonDetailsDTO getNilonDetailsByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        NilonDetailsDTO nilonDetailsDTO = this.stockItemService.getNilonDetailsByRefNoAndStockId(refNo, stockId);
        return nilonDetailsDTO;
    }

    @GetMapping({"/getChemicalDetailsByrefNoAndStockId"})
    public ChemicalDetailsDTO getChemicalDetailsByrefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        ChemicalDetailsDTO chemicalDetailsDTO = this.stockItemService.getChemicalDetailsByrefNoAndStockId(refNo, stockId);
        return chemicalDetailsDTO;
    }
}
