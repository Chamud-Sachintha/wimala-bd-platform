package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.service.DeleteEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/delete")
public class DeleteentityController {
    @Autowired
    private DeleteEntityService deleteEntityService;

    @DeleteMapping({"/mainBranch"})
    public boolean deleteMainBranchByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deleteMainBranchByRefNo(refNo);
        return data;
    }

    @DeleteMapping({"/agentDetails"})
    public boolean deleteAgentByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deleteAgentByRefNo(refNo);
        return data;
    }

    @DeleteMapping({"/lablingEmployee"})
    public boolean deleteLablingEmployeeByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deleteLablingEmployeeByRefNo(refNo);
        return data;
    }

    @DeleteMapping({"/packagingEmployee"})
    public boolean deletePackagingEmployeeByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deletePackagingEmployeeByRefNo(refNo);
        return data;
    }

    @DeleteMapping({"/shop"})
    public boolean deleteShopByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deleteShopByRefNo(refNo);
        return data;
    }

    @DeleteMapping({"/transportEmployee"})
    public boolean deleteTransportEmployeeByRefNo(@RequestParam String refNo) {
        boolean data = this.deleteEntityService.deleteTransportEmployeeByRefNo(refNo);
        return data;
    }
}