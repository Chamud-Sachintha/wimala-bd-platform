package com.example.wimalabdplatform.entity.StockItems;

import com.example.wimalabdplatform.entity.StockDetailsDTO;

import javax.persistence.*;

@Entity
public class WrappingLeavesDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String leaveType;
    private int quantity;
    private float unitPrice;

    private int stock_id;

    public int getStockId() {
        return stock_id;
    }

    public void setStockId(int stockId) {
        this.stock_id = stockId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
