package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "line")
public class LineDTO {
    @Id
    private String shopOwnerNicNo;
    private String shopOwnerName;
    private String shopLocation;
    private String shopMobileNo;

    public String getShopOwnerNicNo() {
        return shopOwnerNicNo;
    }

    public void setShopOwnerNicNo(String shopOwnerNicNo) {
        this.shopOwnerNicNo = shopOwnerNicNo;
    }

    public String getShopOwnerName() {
        return shopOwnerName;
    }

    public void setShopOwnerName(String shopOwnerName) {
        this.shopOwnerName = shopOwnerName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public String getShopMobileNo() {
        return shopMobileNo;
    }

    public void setShopMobileNo(String shopMobileNo) {
        this.shopMobileNo = shopMobileNo;
    }
}
