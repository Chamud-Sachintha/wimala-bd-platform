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
}