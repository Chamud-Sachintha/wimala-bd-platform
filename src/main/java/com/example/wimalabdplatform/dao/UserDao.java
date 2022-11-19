package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users, String> {
}
