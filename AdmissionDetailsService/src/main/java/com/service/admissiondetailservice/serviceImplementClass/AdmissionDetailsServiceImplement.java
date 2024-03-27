package com.service.admissiondetailservice.serviceImplementClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.admissiondetailservice.entity.AdmissionDetails;
import com.service.admissiondetailservice.repositories.AdmissionDetailsRepository;
import com.service.admissiondetailservice.servicesInterface.AdmissionDetailsService;

@Service
public class AdmissionDetailsServiceImplement implements AdmissionDetailsService {

    @Autowired
    private AdmissionDetailsRepository admissionDetailsRepository;

    @Override
    public AdmissionDetails saveAdmissionDetails(AdmissionDetails admissionDetails) {
       return admissionDetailsRepository.save(admissionDetails);
    }


    @Override
    public List<AdmissionDetails> getAllStudentsAdmissionDetails() {
       return admissionDetailsRepository.findAll();
    }

    @Override
    public List<AdmissionDetails> getAdmissionbyStudentID(String  studentId) {
         return admissionDetailsRepository.findByStudentId(studentId);
    }


    @Override
    public List<AdmissionDetails> getAdmissionbyRollNumber(String roll_Number) {
       return admissionDetailsRepository.findByRollNumber(roll_Number);  
    }
    
}
