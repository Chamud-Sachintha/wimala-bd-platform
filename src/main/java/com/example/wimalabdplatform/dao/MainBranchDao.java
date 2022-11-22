package com.example.wimalabdplatform.dao;

import com.example.wimalabdplatform.entity.MainBranches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainBranchDao extends JpaRepository<MainBranches, String> {
}
