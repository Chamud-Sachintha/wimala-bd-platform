package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEntityService {
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

    public boolean deleteMainBranchByRefNo(String refNo) {
        try {
            this.mainBranchDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }

    public boolean deleteAgentByRefNo(String refNo) {
        try {
            this.agentDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }

    public boolean deleteLablingEmployeeByRefNo(String refNo) {
        try {
            this.lablingEmployeeDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }

    public boolean deletePackagingEmployeeByRefNo(String refNo) {
        try {
            this.packagingEmployeeDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }

    public boolean deleteShopByRefNo(String refNo) {
        try {
            this.lineDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }

    public boolean deleteTransportEmployeeByRefNo(String refNo) {
        try {
            this.transportEmployeeDao.deleteById(refNo);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("There is A Error Occur." + e.getMessage());
        }
    }
}
