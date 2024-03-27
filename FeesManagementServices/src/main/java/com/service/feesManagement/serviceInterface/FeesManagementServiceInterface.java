package com.service.feesManagement.serviceInterface;

import com.service.feesManagement.entity.FeesManagement;
import java.util.*;

public interface FeesManagementServiceInterface {
    //create
    public FeesManagement saveFeesDetails(FeesManagement feesManagement);

    //delete

    //update

    //getAll
    public List<FeesManagement> getAllData();

    //getByStudentID 
    public List<FeesManagement> getFeesDetailsByStudentID(String studentId);
}
