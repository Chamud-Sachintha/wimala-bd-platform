package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.entity.*;
import com.example.wimalabdplatform.service.ManageEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/manage")
public class ManageEntityController {

    @Autowired
    private ManageEntityService manageEntityService;

    @PutMapping({"/updateMainBranch"})
    public MainBranches updateMainBranchByBranchRefNo(@RequestParam String branchRefNo, @RequestBody MainBranches newBranchDetails) {
        MainBranches mainBranch = manageEntityService.updateMainBranchByBranchId(branchRefNo, newBranchDetails);
        return mainBranch;
    }

    @PutMapping({"/updateAgent"})
    public AgentDTO updateAgentByAgentRefNo(@RequestParam String agentRefNo, @RequestBody AgentDTO newAgentDetails) {
        AgentDTO agentDetails = manageEntityService.updateAgentdetailsByAgentId(agentRefNo, newAgentDetails);
        return agentDetails;
    }

    @PutMapping({"/updateLablingEmployee"})
    public LablingEmployeeDTO updateLablingEmployeeByRefNo(@RequestParam String refNo, @RequestBody LablingEmployeeDTO newLablingEmployeeDetails) {
        LablingEmployeeDTO lablingEmployeeDetails = manageEntityService.updateLablingEmployeeByEmployeeRefNo(refNo, newLablingEmployeeDetails);
        return lablingEmployeeDetails;
    }

    @PutMapping({"/updatePackagingEmployee"})
    public PackagingEmployeeDTO updatePackagingEmployeeByEmployeeRefNo(@RequestParam String refNo, PackagingEmployeeDTO newPackagingEmployeeDetails) {
        PackagingEmployeeDTO packagingEmployeeDetails = manageEntityService.updatePackagingEmployeeByEmployeerefNo(refNo, newPackagingEmployeeDetails);
        return packagingEmployeeDetails;
    }

    @PutMapping({"/updateShopDetails"})
    public LineDTO updateShopDetailsByRefNo(@RequestParam String shopNic, @RequestBody LineDTO newShopDetails) {
        LineDTO shopdetails = manageEntityService.updateShopDetailsByShopId(shopNic, newShopDetails);
        return shopdetails;
    }

    @PutMapping({"/updateTransportEmployee"})
    public TransportEmployeeDTO updateTransportEmployeeByRefNo(@RequestParam String refNo, @RequestBody TransportEmployeeDTO newTransportEmployeeDetails) {
        TransportEmployeeDTO transportEmployeeDetails = manageEntityService.updateTransportEmployeeByRefNo(refNo, newTransportEmployeeDetails);
        return transportEmployeeDetails;
    }
}
