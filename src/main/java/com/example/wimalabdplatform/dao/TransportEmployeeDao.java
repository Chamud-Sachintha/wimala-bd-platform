package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.TransportEmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportEmployeeDao extends JpaRepository<TransportEmployeeDTO, String> {
}
