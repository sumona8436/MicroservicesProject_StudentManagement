package com.service.admissiondetailservice.servicesInterface;

import com.service.admissiondetailservice.entity.AdmissionDetails;
import java.util.*;

public interface AdmissionDetailsService {
     //create
     AdmissionDetails saveAdmissionDetails(AdmissionDetails admissionDetails);


    //update

    //delete

    //viewByStudentID
    List<AdmissionDetails> getAdmissionbyStudentID(String  studentId);

    //viewByRollnumber
    List<AdmissionDetails> getAdmissionbyRollNumber(String  roll_Number);

    //viewAll
    List<AdmissionDetails> getAllStudentsAdmissionDetails();
}
