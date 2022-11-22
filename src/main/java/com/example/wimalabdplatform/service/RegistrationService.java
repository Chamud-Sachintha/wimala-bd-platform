package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.*;
import com.example.wimalabdplatform.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrationService {

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

    public MainBranches addNewMainBranchDetail(MainBranches mainBranchDetails) throws Exception {
        if (validateMainBranchExist(mainBranchDetails) == true) {
            try {
                return this.mainBranchDao.save(mainBranchDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Branch Exist.");
            return null;
        }
    }

    public AgentDTO addNewAgentDetails(AgentDTO newAgentDetails) throws Exception {
        if (validateAgentExist(newAgentDetails) == true) {
            try {
                return this.agentDao.save(newAgentDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Agent Exist.");
            return null;
        }
    }

    public LablingEmployeeDTO addNewLablingEmployeeDetails(LablingEmployeeDTO newLablingEmployeeDetails) throws Exception {
        if (validateLablingEmployeeExist(newLablingEmployeeDetails) == true) {
            try {
                return this.lablingEmployeeDao.save(newLablingEmployeeDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Agent Exist.");
            return null;
        }
    }

    public PackagingEmployeeDTO addNewPackagingEmployeeDetails(PackagingEmployeeDTO newPackagingEmployeeDetails) throws Exception {
        if (validatePackagingEmployeeExist(newPackagingEmployeeDetails) == true) {
            try {
                return this.packagingEmployeeDao.save(newPackagingEmployeeDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Agent Exist.");
            return null;
        }
    }

    public LineDTO addNewShopDetails(LineDTO newShopDetails) throws Exception {
        if (validateShopExist(newShopDetails) == true) {
            try {
                return this.lineDao.save(newShopDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Agent Exist.");
            return null;
        }
    }

    public TransportEmployeeDTO addNewTransportEmployeeDetails(TransportEmployeeDTO newTransportEmployeeDetails) throws Exception {
        if (validateTransportEmployeeExist(newTransportEmployeeDetails) == true) {
            try {
                return this.transportEmployeeDao.save(newTransportEmployeeDetails);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            System.out.println("There is Duplicate Agent Exist.");
            return null;
        }
    }

    private boolean validateTransportEmployeeExist(TransportEmployeeDTO transportEmployeeDTO) {
        if (transportEmployeeDTO.getTransportEmpNicNo() != null) {
            Optional<TransportEmployeeDTO> getTransportEmployeeDetails = this.transportEmployeeDao.findById(transportEmployeeDTO.getTransportEmpNicNo());

            if (getTransportEmployeeDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }

    private boolean validateShopExist(LineDTO lineDTO) {
        if (lineDTO.getShopOwnerNicNo() != null) {
            Optional<LineDTO> getShopDetails = this.lineDao.findById(lineDTO.getShopOwnerNicNo());

            if (getShopDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }

    private boolean validatePackagingEmployeeExist(PackagingEmployeeDTO packagingEmployeeDTO) {
        if (packagingEmployeeDTO.getPackagingEmpRefNo() != null) {
            Optional<PackagingEmployeeDTO> getPackagingEmployeeDetails = this.packagingEmployeeDao.findById(packagingEmployeeDTO.getPackagingEmpRefNo());

            if (getPackagingEmployeeDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }

    private boolean validateLablingEmployeeExist(LablingEmployeeDTO lablingEmployeeDetails) {
        if (lablingEmployeeDetails.getLabelEmpRefNo() != null) {
            Optional<LablingEmployeeDTO> getLablingEmployeeDetails = this.lablingEmployeeDao.findById(lablingEmployeeDetails.getLabelEmpRefNo());

            if (getLablingEmployeeDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }

    private boolean validateAgentExist(AgentDTO agentDetails) {
        if (agentDetails.getAgentRefNo() != null) {
            Optional<AgentDTO> getAgentDetails = this.agentDao.findById(agentDetails.getAgentRefNo());

            if (getAgentDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }

    private boolean validateMainBranchExist(MainBranches mainBranchDetails) {
        if (mainBranchDetails.getBranchRefNo() != null) {
            Optional<MainBranches> getMainBranchDetails = this.mainBranchDao.findById(mainBranchDetails.getBranchRefNo());

            if (getMainBranchDetails.isPresent() == false) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("Invalid Ref Number.");
        }
    }
}
