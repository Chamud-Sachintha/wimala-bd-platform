package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.AgentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentDao extends JpaRepository<AgentDTO, String> {
}
