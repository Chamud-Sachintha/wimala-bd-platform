package com.example.wimalabdplatform.controller.StockItems;

import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import com.example.wimalabdplatform.service.StockItem.ManageStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("stockItems/manage")
public class ManageStockItemController {

    @Autowired
    private ManageStockItemService manageStockItemService;

    @PutMapping({"/wrappingLeaves"})
    public WrappingLeavesDTO updateWrappingLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId ,@RequestBody WrappingLeavesDTO wrappingLeavesDTO) {
        WrappingLeavesDTO wrappingLeavesDTO1 = this.manageStockItemService.updateWrappingLeavesByStockIdAndId(refNo, stockId, wrappingLeavesDTO);
        return wrappingLeavesDTO1;
    }

    @PutMapping({"/tobaccoLeaves"})
    public TobaccoLeavesDTO updateTobaccoLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId, @RequestBody TobaccoLeavesDTO tobaccoLeavesDTO) {
        TobaccoLeavesDTO tobaccoLeavesDTO1 = this.manageStockItemService.updateTobaccoLeavesByRefNoAndStockId(refNo, stockId, tobaccoLeavesDTO);
        return tobaccoLeavesDTO1;
    }

    @PutMapping({"/nilonDetails"})
    public NilonDetailsDTO updateNilonDetailsByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId, @RequestBody NilonDetailsDTO nilonDetailsDTO) {
        NilonDetailsDTO nilonDetailsDTO1 = this.manageStockItemService.updateNilonDetailsByRefNoAndStockId(refNo, stockId, nilonDetailsDTO);
        return nilonDetailsDTO1;
    }

    @PutMapping({"/chemicalDetails"})
    public ChemicalDetailsDTO updateChemicalDetailsByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId, @RequestBody ChemicalDetailsDTO chemicalDetailsDTO) {
        ChemicalDetailsDTO chemicalDetailsDTO1 = this.manageStockItemService.updateChemicalDetailsByRefNoAndStockId(refNo, stockId, chemicalDetailsDTO);
        return chemicalDetailsDTO1;
    }
}
