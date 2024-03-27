package com.service.feesManagement.repositories;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.service.feesManagement.entity.FeesManagement;

public interface FeesManagementRepo extends JpaRepository<FeesManagement,String>{
    //custom query
    List<FeesManagement> findByStudentId(String studentId);
}
