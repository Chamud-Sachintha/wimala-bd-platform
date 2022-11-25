package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "main_branches")
public class MainBranches {
    @Id
    private String branchRefNo;
    private String branchEmployeeName;
    private String branchEmployeeAddress;
    private String branchEmployeeNicNumber;

    public String getBranchRefNo() {
        return branchRefNo;
    }

    public void setBranchRefNo(String branchRefNo) {
        this.branchRefNo = branchRefNo;
    }

    public String getBranchEmployeeName() {
        return branchEmployeeName;
    }

    public void setBranchEmployeeName(String branchEmployeeName) {
        this.branchEmployeeName = branchEmployeeName;
    }

    public String getBranchEmployeeAddress() {
        return branchEmployeeAddress;
    }

    public void setBranchEmployeeAddress(String branchEmployeeAddress) {
        this.branchEmployeeAddress = branchEmployeeAddress;
    }

    public String getBranchEmployeeNicNumber() {
        return branchEmployeeNicNumber;
    }

    public void setBranchEmployeeNicNumber(String branchEmployeeNicNumber) {
        this.branchEmployeeNicNumber = branchEmployeeNicNumber;
    }
}
