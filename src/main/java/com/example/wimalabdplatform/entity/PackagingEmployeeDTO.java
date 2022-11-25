package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "packaging_employee")
public class PackagingEmployeeDTO {
    @Id
    private String packagingEmpRefNo;
    private String packagingEmpName;
    private String packagingEmpAddress;
    private String packagingEmpNicNo;
    private String packagingEmpContactNo;

    public String getPackagingEmpRefNo() {
        return packagingEmpRefNo;
    }

    public void setPackagingEmpRefNo(String packagingEmpRefNo) {
        this.packagingEmpRefNo = packagingEmpRefNo;
    }

    public String getPackagingEmpName() {
        return packagingEmpName;
    }

    public void setPackagingEmpName(String packagingEmpName) {
        this.packagingEmpName = packagingEmpName;
    }

    public String getPackagingEmpAddress() {
        return packagingEmpAddress;
    }

    public void setPackagingEmpAddress(String packagingEmpAddress) {
        this.packagingEmpAddress = packagingEmpAddress;
    }

    public String getPackagingEmpNicNo() {
        return packagingEmpNicNo;
    }

    public void setPackagingEmpNicNo(String packagingEmpNicNo) {
        this.packagingEmpNicNo = packagingEmpNicNo;
    }

    public String getPackagingEmpContactNo() {
        return packagingEmpContactNo;
    }

    public void setPackagingEmpContactNo(String packagingEmpContactNo) {
        this.packagingEmpContactNo = packagingEmpContactNo;
    }
}
