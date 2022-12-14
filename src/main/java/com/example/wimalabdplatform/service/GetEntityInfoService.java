package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.*;
import com.example.wimalabdplatform.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetEntityInfoService {

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

    public List<MainBranches> getAllMainBranches() {
        List<MainBranches> mainBranchesList = this.mainBranchDao.findAll();
        return mainBranchesList;
    }

    public List<AgentDTO> getAllAgent() {
        List<AgentDTO> agentDTOS = this.agentDao.findAll();
        return agentDTOS;
    }

    public List<LablingEmployeeDTO> getAllLablingEmployees() {
        List<LablingEmployeeDTO> lablingEmployeeDTOS = this.lablingEmployeeDao.findAll();
        return lablingEmployeeDTOS;
    }

    public List<PackagingEmployeeDTO> getAllPackagingEmployees() {
        List<PackagingEmployeeDTO> packagingEmployeeDTOS = this.packagingEmployeeDao.findAll();
        return packagingEmployeeDTOS;
    }

    public List<LineDTO> getAllShopDetails() {
        List<LineDTO> lineDTOS = this.lineDao.findAll();
        return lineDTOS;
    }

    public List<TransportEmployeeDTO> getAllTransportEmployees() {
        List<TransportEmployeeDTO> transportEmployeeDTOS = this.transportEmployeeDao.findAll();
        return transportEmployeeDTOS;
    }

    public Optional<MainBranches> getMainBranchDetailById(String branchrefNo) {
        Optional<MainBranches> mainBrancheDetail = null;

        if (branchrefNo != null) {
            mainBrancheDetail = this.mainBranchDao.findById(branchrefNo);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return mainBrancheDetail;
    }

    public Optional<AgentDTO> getAgentDetailById(String agentRefNo) {
        Optional<AgentDTO> agentDetails = null;

        if (agentRefNo != null) {
            agentDetails = this.agentDao.findById(agentRefNo);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return agentDetails;
    }

    public Optional<LablingEmployeeDTO> getLablingEployeeDetailsById(String empRefNo) {
        Optional<LablingEmployeeDTO> lablingEmployeeDetails = null;

        if (empRefNo != null) {
            lablingEmployeeDetails = this.lablingEmployeeDao.findById(empRefNo);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return lablingEmployeeDetails;
    }

    public Optional<PackagingEmployeeDTO> getPackagingEmployeedetailsById(String empRefNo) {
        Optional<PackagingEmployeeDTO> packagingEmployeeDetails = null;

        if (empRefNo != null) {
            packagingEmployeeDetails = this.packagingEmployeeDao.findById(empRefNo);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return packagingEmployeeDetails;
    }

    public Optional<LineDTO> getShopDetailsById(String shopOwnerNic) {
        Optional<LineDTO> shopDetails = null;

        if (shopOwnerNic != null) {
            shopDetails = this.lineDao.findById(shopOwnerNic);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return shopDetails;
    }

    public Optional<TransportEmployeeDTO> getTransportEmployeeDetailsById(String emprefNo) {
        Optional<TransportEmployeeDTO> transportEmployeeDetails = null;

        if (emprefNo != null) {
            transportEmployeeDetails = this.transportEmployeeDao.findById(emprefNo);
        } else {
            throw new NullPointerException("Branch Ref No is Required.");
        }

        return transportEmployeeDetails;
    }
}
