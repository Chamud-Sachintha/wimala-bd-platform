package com.example.wimalabdplatform.entity.StockItems;

import com.example.wimalabdplatform.entity.StockDetailsDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
public class WrappingLeavesDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String leaveType;
    private int quantity;
    private float unitPrice;

    private Date createdDate;

    private int stock_id;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

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
