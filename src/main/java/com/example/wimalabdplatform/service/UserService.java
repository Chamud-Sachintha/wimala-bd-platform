package com.example.wimalabdplatform.service;

import com.example.wimalabdplatform.dao.RoleDao;
import com.example.wimalabdplatform.dao.UserDao;
import com.example.wimalabdplatform.entity.Role;
import com.example.wimalabdplatform.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users createNewUser(Users user) {
        return this.userDao.save(user);
    }

    public void initUserRolesAndUser() {
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role For Application");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User Role For Application");
        roleDao.save(userRole);

        Users adminUser = new Users();
        adminUser.setFirstName("Chamud");
        adminUser.setLastName("Sachintha");
        adminUser.setUserName("chamud123@gmail.com");
        adminUser.setUserPassword(getEncodedPassword("chamud123"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        Users user = new Users();
        user.setFirstName("Neranjan");
        user.setLastName("Madusanka");
        user.setUserName("neranjan123@gmail.com");
        user.setUserPassword(getEncodedPassword("neranjan123"));
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);
    }

    private String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
