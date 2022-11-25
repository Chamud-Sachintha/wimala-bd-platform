package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "labling_employee")
public class LablingEmployeeDTO {
    @Id
    private String labelEmpRefNo;

    private String labelEmployeeName;
    private String labelEmpNicNumber;

    private String labelEmpContactNo;
    private String labelEmpAddress;

    public String getLabelEmpRefNo() {
        return labelEmpRefNo;
    }

    public void setLabelEmpRefNo(String labelEmpRefNo) {
        this.labelEmpRefNo = labelEmpRefNo;
    }

    public String getLabelEmployeeName() {
        return labelEmployeeName;
    }

    public void setLabelEmployeeName(String labelEmployeeName) {
        this.labelEmployeeName = labelEmployeeName;
    }

    public String getLabelEmpNicNumber() {
        return labelEmpNicNumber;
    }

    public void setLabelEmpNicNumber(String labelEmpNicNumber) {
        this.labelEmpNicNumber = labelEmpNicNumber;
    }

    public String getLabelEmpContactNo() {
        return labelEmpContactNo;
    }

    public void setLabelEmpContactNo(String labelEmpContactNo) {
        this.labelEmpContactNo = labelEmpContactNo;
    }

    public String getLabelEmpAddress() {
        return labelEmpAddress;
    }

    public void setLabelEmpAddress(String labelEmpAddress) {
        this.labelEmpAddress = labelEmpAddress;
    }
}
