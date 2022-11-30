package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.entity.*;
import com.example.wimalabdplatform.service.GetEntityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/get")
public class GetEntityInfoController {

    @Autowired
    private GetEntityInfoService getEntityInfoService;

    @GetMapping({"/allMainBranhesList"})
    public List<MainBranches> getAllMainBranches() {
        List<MainBranches> mainBranchesList = new ArrayList<>();

        try {
            mainBranchesList = this.getEntityInfoService.getAllMainBranches();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return mainBranchesList;
    }

    @GetMapping({"/allAgentList"})
    public List<AgentDTO> getAllAgentList() {
        List<AgentDTO> agentList = new ArrayList<>();

        try {
            agentList = this.getEntityInfoService.getAllAgent();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return agentList;
    }

    @GetMapping({"/allLablingEmployees"})
    public List<LablingEmployeeDTO> allLablingEmployeesList() {
        List<LablingEmployeeDTO> lablingEmployeeDTOS = new ArrayList<>();

        try {
            lablingEmployeeDTOS = this.getEntityInfoService.getAllLablingEmployees();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return lablingEmployeeDTOS;
    }

    @GetMapping({"/allPackagingEmployees"})
    public List<PackagingEmployeeDTO> allPackagingEmployeesList() {
        List<PackagingEmployeeDTO> packagingEmployeeDTOS = new ArrayList<>();

        try {
            packagingEmployeeDTOS = this.getEntityInfoService.getAllPackagingEmployees();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return packagingEmployeeDTOS;
    }

    @GetMapping({"/allShopDetails"})
    public List<LineDTO> allShopDetailsList() {
        List<LineDTO> lineDTOS = new ArrayList<>();

        try {
            lineDTOS = this.getEntityInfoService.getAllShopDetails();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return lineDTOS;
    }

    @GetMapping({"/allTransportEmployees"})
    public List<TransportEmployeeDTO> allTransportEmployeesList() {
        List<TransportEmployeeDTO> transportEmployeeDTOS = new ArrayList<>();

        try {
            transportEmployeeDTOS = this.getEntityInfoService.getAllTransportEmployees();
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return transportEmployeeDTOS;
    }

    @GetMapping({"/getMainBranDetailById"})
    public Optional<MainBranches> getMainBranDetailById(@RequestParam String branchRefNo) {
        Optional<MainBranches> mainBranchDetailById = null;
        try {
            mainBranchDetailById = this.getEntityInfoService.getMainBranchDetailById(branchRefNo);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return mainBranchDetailById;
    }

    @GetMapping({"/getAgentDetailsById"})
    public Optional<AgentDTO> getAgentDetailsById(@RequestParam String agentRefNo) {
        Optional<AgentDTO> agentDetailsById = null;
        try {
            agentDetailsById = this.getEntityInfoService.getAgentDetailById(agentRefNo);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return agentDetailsById;
    }

    @GetMapping({"/getLablingEmployeeDetailsById"})
    public Optional<LablingEmployeeDTO> getLablingEmployeeDetailsById(@RequestParam String empRefNo) {
        Optional<LablingEmployeeDTO> lablingEmployeeDetails = null;
        try {
            lablingEmployeeDetails = this.getEntityInfoService.getLablingEployeeDetailsById(empRefNo);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return lablingEmployeeDetails;
    }

    @GetMapping({"/getPackagingEmployeeDetailsById"})
    public Optional<PackagingEmployeeDTO> getPackagingEmployeeDetailsById(@RequestParam String empRefNo) {
        Optional<PackagingEmployeeDTO> packagingEmployeeDetails = null;
        try {
            packagingEmployeeDetails = this.getEntityInfoService.getPackagingEmployeedetailsById(empRefNo);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return packagingEmployeeDetails;
    }

    @GetMapping({"/getShopdetailsById"})
    public Optional<LineDTO> getShopdetailsById(@RequestParam String shopOwnerNic) {
        Optional<LineDTO> shopdetails = null;
        try {
            shopdetails = this.getEntityInfoService.getShopDetailsById(shopOwnerNic);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return shopdetails;
    }

    @GetMapping({"/getTransportEmployeeDetailsById"})
    public Optional<TransportEmployeeDTO> getTransportEmployeeDetailsById(@RequestParam String empRefNo) {
        Optional<TransportEmployeeDTO> transportEmployeeDetails = null;
        try {
            transportEmployeeDetails = this.getEntityInfoService.getTransportEmployeeDetailsById(empRefNo);
        } catch (Exception e) {
            throw new RuntimeException("There is An Error Occured.");
        }

        return transportEmployeeDetails;
    }
}