package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.*;
import com.example.wimalabdplatform.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManageEntityService {
    @Autowired
    private MainBranchDao mainBranchDao;

    @Autowired
    private AgentDao agentDao;

    @Autowired
    private LablingEmployeeDao lablingEmployeeDao;

    @Autowired
    private PackagingEmployeeDao packagingEmployeeDao;

    @Autowired
    private LineDao lineDao;

    @Autowired
    private TransportEmployeeDao transportEmployeeDao;

    public MainBranches updateMainBranchByBranchId(String branchRefNo, MainBranches newBranchDetails) {
        Optional<MainBranches> getBranchDetail = null;
        try {
            getBranchDetail = this.mainBranchDao.findById(branchRefNo);
            getBranchDetail.get().setBranchEmployeeName(newBranchDetails.getBranchEmployeeName());
            getBranchDetail.get().setBranchEmployeeNicNumber(newBranchDetails.getBranchEmployeeNicNumber());
            getBranchDetail.get().setBranchEmployeeAddress(newBranchDetails.getBranchEmployeeAddress());

            this.mainBranchDao.save(getBranchDetail.get());
        } catch (Exception e) {
            throw new RuntimeException("There is Error Occured.");
        }

        return getBranchDetail.get();
    }

    public AgentDTO updateAgentdetailsByAgentId(String refNo, AgentDTO newAgentDetails) {
        Optional<AgentDTO> getAgentDetails = null;
        try {
            getAgentDetails = this.agentDao.findById(refNo);
            getAgentDetails.get().setAgentname(newAgentDetails.getAgentname());
            getAgentDetails.get().setAgentNicNumber(newAgentDetails.getAgentNicNumber());
            getAgentDetails.get().setAgentLocation(newAgentDetails.getAgentLocation());

            this.agentDao.save(getAgentDetails.get());
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return getAgentDetails.get();
    }

    public LablingEmployeeDTO updateLablingEmployeeByEmployeeRefNo(String refNo, LablingEmployeeDTO newLablingEmployeeDetails) {
        Optional<LablingEmployeeDTO> getLablingEmployee = null;
        try {
            getLablingEmployee = this.lablingEmployeeDao.findById(refNo);
            getLablingEmployee.get().setLabelEmployeeName(newLablingEmployeeDetails.getLabelEmployeeName());
            getLablingEmployee.get().setLabelEmpNicNumber(newLablingEmployeeDetails.getLabelEmpNicNumber());
            getLablingEmployee.get().setLabelEmpAddress(newLablingEmployeeDetails.getLabelEmpAddress());
            getLablingEmployee.get().setLabelEmpContactNo(newLablingEmployeeDetails.getLabelEmpContactNo());

            this.lablingEmployeeDao.save(getLablingEmployee.get());
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return getLablingEmployee.get();
    }

    public PackagingEmployeeDTO updatePackagingEmployeeByEmployeerefNo(String refNo, PackagingEmployeeDTO newPackagingEmployeedetails) {
        Optional<PackagingEmployeeDTO> getPackagingEmployee = null;

        try {
            getPackagingEmployee = this.packagingEmployeeDao.findById(refNo);
            getPackagingEmployee.get().setPackagingEmpName(newPackagingEmployeedetails.getPackagingEmpName());
            getPackagingEmployee.get().setPackagingEmpNicNo(newPackagingEmployeedetails.getPackagingEmpNicNo());
            getPackagingEmployee.get().setPackagingEmpAddress(newPackagingEmployeedetails.getPackagingEmpAddress());
            getPackagingEmployee.get().setPackagingEmpContactNo(newPackagingEmployeedetails.getPackagingEmpContactNo());

            this.packagingEmployeeDao.save(getPackagingEmployee.get());
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return getPackagingEmployee.get();
    }

    public LineDTO updateShopDetailsByShopId(String shopId, LineDTO newShopdetails) {
        Optional<LineDTO> getShopdetails = null;

        try {
            getShopdetails  =this.lineDao.findById(shopId);
            getShopdetails.get().setShopOwnerName(newShopdetails.getShopOwnerName());
            getShopdetails.get().setShopLocation(newShopdetails.getShopLocation());
            getShopdetails.get().setShopMobileNo(newShopdetails.getShopMobileNo());

            this.lineDao.save(getShopdetails.get());
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured,");
        }

        return getShopdetails.get();
    }

    public TransportEmployeeDTO updateTransportEmployeeByRefNo(String refNo, TransportEmployeeDTO newTransportEmployeeDetails) {
        Optional<TransportEmployeeDTO> getTransportEmployeeDetails = null;

        try {
            getTransportEmployeeDetails = this.transportEmployeeDao.findById(refNo);
            getTransportEmployeeDetails.get().setTransportEmpName(newTransportEmployeeDetails.getTransportEmpName());
            getTransportEmployeeDetails.get().setTransportEmpMobile(newTransportEmployeeDetails.getTransportEmpMobile());

            this.transportEmployeeDao.save(getTransportEmployeeDetails.get());
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return getTransportEmployeeDetails.get();
    }
}
