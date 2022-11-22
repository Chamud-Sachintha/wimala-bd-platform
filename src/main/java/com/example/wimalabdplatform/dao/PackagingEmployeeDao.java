package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.PackagingEmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagingEmployeeDao extends JpaRepository<PackagingEmployeeDTO, String> {
}
