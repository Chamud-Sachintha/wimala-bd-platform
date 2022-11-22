package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.LineDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineDao extends JpaRepository<LineDTO, String> {
}
