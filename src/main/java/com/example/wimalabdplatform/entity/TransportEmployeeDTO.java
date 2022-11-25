package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport_employee")
public class TransportEmployeeDTO {
    @Id
    private String transportEmpNicNo;
    private String transportEmpName;
    private String transportEmpMobile;

    public String getTransportEmpNicNo() {
        return transportEmpNicNo;
    }

    public void setTransportEmpNicNo(String transportEmpNicNo) {
        this.transportEmpNicNo = transportEmpNicNo;
    }

    public String getTransportEmpName() {
        return transportEmpName;
    }

    public void setTransportEmpName(String transportEmpName) {
        this.transportEmpName = transportEmpName;
    }

    public String getTransportEmpMobile() {
        return transportEmpMobile;
    }

    public void setTransportEmpMobile(String transportEmpMobile) {
        this.transportEmpMobile = transportEmpMobile;
    }
}
