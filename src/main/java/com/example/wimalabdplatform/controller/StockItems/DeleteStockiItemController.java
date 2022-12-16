package com.example.wimalabdplatform.controller.StockItems;

import com.example.wimalabdplatform.service.StockItem.DeleteStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/stockItems/delete")
public class DeleteStockiItemController {

    @Autowired
    private DeleteStockItemService deleteStockItemService;

    @DeleteMapping({"/wrappingLeaves"})
    public boolean deleteWrappingLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        boolean data = this.deleteStockItemService.deleteWrappingleavesByRefNoAndStockId(refNo, stockId);
        return data;
    }

    @DeleteMapping({"/tobaccoLeaves"})
    public boolean deleteTobaccoLeavesByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        boolean data = this.deleteStockItemService.deleteTobaccoLeavesByrefNoAndStockId(refNo, stockId);
        return data;
    }

    @DeleteMapping({"/nilonDetails"})
    public boolean deleteNilonDetailsByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockid) {
        boolean data = this.deleteStockItemService.deleteNilonDetailsByRefNoAndStockId(refNo, stockid);
        return data;
    }

    @DeleteMapping({"/chemicalDetails"})
    public boolean deleteChemicalDetailsByRefNoAndStockId(@RequestParam int refNo, @RequestParam int stockId) {
        boolean data = this.deleteStockItemService.deleteChemicaldetailsByrefNoAndStockId(refNo, stockId);
        return data;
    }
}
