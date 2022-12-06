package com.example.wimalabdplatform.service.StockItem;

import com.example.wimalabdplatform.dao.StockDao;
import com.example.wimalabdplatform.dao.StockItem.ChemicalDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.NilonDetailsDao;
import com.example.wimalabdplatform.dao.StockItem.TobaccoLeavesDao;
import com.example.wimalabdplatform.dao.StockItem.WrapingLeavesDao;
import com.example.wimalabdplatform.entity.StockDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.ChemicalDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.NilonDetailsDTO;
import com.example.wimalabdplatform.entity.StockItems.TobaccoLeavesDTO;
import com.example.wimalabdplatform.entity.StockItems.WrappingLeavesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockItemService {

    @Autowired
    private WrapingLeavesDao wrapingLeavesDao;

    @Autowired
    private TobaccoLeavesDao tobaccoLeavesDao;

    @Autowired
    private NilonDetailsDao nilonDetailsDao;

    @Autowired
    private ChemicalDetailsDao chemicalDetailsDao;

    @Autowired
    private StockDao stockDao;

    public Optional<WrappingLeavesDTO> getWrappingLeavesBySockId(int stockId) {
        Optional<WrappingLeavesDTO> wrappingLeavesDTOS = null;
        validateStockId(stockId);

        try {
            wrappingLeavesDTOS = this.wrapingLeavesDao.findById(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error " + e.getMessage());
        }

        return wrappingLeavesDTOS;
    }

    public Optional<TobaccoLeavesDTO> getTobaccoLeavesByStockId(int stockId) {
        Optional<TobaccoLeavesDTO> tobaccoLeavesDTO = null;
        validateStockId(stockId);

        try {
            tobaccoLeavesDTO = this.tobaccoLeavesDao.findById(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error " + e.getMessage());
        }

        return tobaccoLeavesDTO;
    }

    public Optional<NilonDetailsDTO> getNilonDetailsByStockId(int stockId) {
        Optional<NilonDetailsDTO> nilonDetailsDTO = null;
        validateStockId(stockId);

        try {
            nilonDetailsDTO = this.nilonDetailsDao.findById(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error " + e.getMessage());
        }

        return nilonDetailsDTO;
    }

    public Optional<ChemicalDetailsDTO> getChemicalDetailsByStockId(int stockId) {
        Optional<ChemicalDetailsDTO> chemicalDetailsDTO = null;
        validateStockId(stockId);

        try {
            chemicalDetailsDTO = this.chemicalDetailsDao.findById(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error " + e.getMessage());
        }

        return chemicalDetailsDTO;
    }

    public WrappingLeavesDTO addNewWrappingLeavesSet(WrappingLeavesDTO wrappingLeavesDTO) {
        validateStockId(wrappingLeavesDTO.getStockId());
        try {
            return this.wrapingLeavesDao.save(wrappingLeavesDTO);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occur " + e.getMessage());
        }
    }

    public TobaccoLeavesDTO addNewTobaccoLeaveSet(TobaccoLeavesDTO tobaccoLeavesDTO) {
        validateStockId(tobaccoLeavesDTO.getStock_id());
        try {
            return this.tobaccoLeavesDao.save(tobaccoLeavesDTO);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occur" + e.getMessage());
        }
    }

    public NilonDetailsDTO addNewNilonSet(NilonDetailsDTO nilonDetailsDTO) {
        try {
            return this.nilonDetailsDao.save(nilonDetailsDTO);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occur" + e.getMessage());
        }
    }

    public ChemicalDetailsDTO addNewChemicalSet(ChemicalDetailsDTO chemicalDetailsDTO) {
        try {
            return this.chemicalDetailsDao.save(chemicalDetailsDTO);
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occur" + e.getMessage());
        }
    }

    public int getwrappingLeaveStockCountByStockId(int stockId) {
        int count = 0;
        try {
            count = this.wrapingLeavesDao.getWrappingLeavesCountByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error " + e.getMessage());
        }

        return count;
    }

    public int getTobaccoLeavesCountByStockId(int stockId) {
        int count = 0;
        try {
            count = this.tobaccoLeavesDao.getTobaccoLeavesCountByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error " + e.getMessage());
        }

        return count;
    }

    public int getNilonDetailsCountByStockId(int stockId) {
        int count = 0;
        try {
            count = this.nilonDetailsDao.getNilonDetailsCountByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error " + e.getMessage());
        }

        return count;
    }

    public int getChemicalDetailsCountByStockId(int stockId) {
        int count = 0;
        try {
            count = this.chemicalDetailsDao.getChemicalDetailsCountByStockId(stockId);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error " + e.getMessage());
        }

        return count;
    }

    private void validateStockId(int stockId) {
        try {
            Optional<StockDetailsDTO> stockDetailsDTO = this.stockDao.findById(stockId);

            if (stockDetailsDTO.get() == null) {
                throw new RuntimeException("There is No Stock ID ");
            }
        } catch (Exception e) {
            throw new RuntimeException("There is an Error Occur" + e.getMessage());
        }
    }
}
