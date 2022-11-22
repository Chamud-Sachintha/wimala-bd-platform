package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.entity.*;
import com.example.wimalabdplatform.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping({"/addNewBranch"})
    public MainBranches addNewMainBranch(@RequestBody MainBranches branchDetails) {
        MainBranches newMainBranch = null;
        try {
            newMainBranch = this.registrationService.addNewMainBranchDetail(branchDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return newMainBranch;
    }

    @PostMapping({"/addNewAgent"})
    public AgentDTO addNewAgetDetail(@RequestBody AgentDTO newAgentDetails) {
        AgentDTO newAgent = null;
        try {
            newAgent = this.registrationService.addNewAgentDetails(newAgentDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return newAgent;
    }

    @PostMapping({"/addNewLablingEmployee"})
    public LablingEmployeeDTO addNewLablingEmployee(@RequestBody LablingEmployeeDTO lablingEmployeeDetails) {
        LablingEmployeeDTO lablingEmployeeDTO = null;
        try {
            lablingEmployeeDTO = this.registrationService.addNewLablingEmployeeDetails(lablingEmployeeDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lablingEmployeeDTO;
    }

    @PostMapping({"/addNewPackagingEmployee"})
    public PackagingEmployeeDTO addNewPackagingEmployee(@RequestBody PackagingEmployeeDTO packagingEmployeeDetails) {
        PackagingEmployeeDTO packagingEmployeeDTO = null;
        try {
            packagingEmployeeDTO = this.registrationService.addNewPackagingEmployeeDetails(packagingEmployeeDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return packagingEmployeeDTO;
    }

    @PostMapping({"/addNewShop"})
    public LineDTO addNewShop(@RequestBody LineDTO shopDetails) {
        LineDTO lineDTO = null;
        try {
            lineDTO = this.registrationService.addNewShopDetails(shopDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lineDTO;
    }

    @PostMapping({"/addNewTransportEmployee"})
    public TransportEmployeeDTO addNewTransportEmployee(@RequestBody TransportEmployeeDTO transportEmployeeDetails) {
        TransportEmployeeDTO transportEmployeeDTO = null;
        try {
            transportEmployeeDTO = this.registrationService.addNewTransportEmployeeDetails(transportEmployeeDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return transportEmployeeDTO;
    }
}
