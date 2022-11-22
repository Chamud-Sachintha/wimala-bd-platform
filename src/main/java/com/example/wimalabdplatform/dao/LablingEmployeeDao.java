package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.LablingEmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LablingEmployeeDao extends JpaRepository<LablingEmployeeDTO, String> {
}
