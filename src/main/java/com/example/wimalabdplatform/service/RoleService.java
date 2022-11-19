package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.RoleDao;
import com.example.wimalabdplatform.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role addNewRole(Role role) {
        return roleDao.save(role);
    }
}
