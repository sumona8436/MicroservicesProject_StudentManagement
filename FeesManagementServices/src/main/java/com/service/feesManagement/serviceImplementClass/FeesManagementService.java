package com.service.feesManagement.serviceImplementClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.feesManagement.entity.FeesManagement;
import com.service.feesManagement.repositories.FeesManagementRepo;
import com.service.feesManagement.serviceInterface.FeesManagementServiceInterface;

@Service
public class FeesManagementService implements FeesManagementServiceInterface{
    @Autowired
    private FeesManagementRepo feesManagementRepo;

    @Override
    public FeesManagement saveFeesDetails(FeesManagement feesManagement) {
      return feesManagementRepo.save(feesManagement);
    }

    @Override
    public List<FeesManagement> getAllData() {
       return feesManagementRepo.findAll();
    }

    @Override
    public List<FeesManagement> getFeesDetailsByStudentID(String studentId) {
        return feesManagementRepo.findByStudentId(studentId);
    }
    
}
