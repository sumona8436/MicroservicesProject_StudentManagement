package com.service.admissiondetailservice.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.admissiondetailservice.entity.AdmissionDetails;
import com.service.admissiondetailservice.servicesInterface.AdmissionDetailsService;

@RestController
@RequestMapping("/admission_details")
public class AdnissionDetailsController {

    @Autowired
    private AdmissionDetailsService admissionDetailsService;

     //create
     @PostMapping
    public ResponseEntity<AdmissionDetails> createAdmissionDetails(@RequestBody AdmissionDetails admissionDetails){
     AdmissionDetails details=  admissionDetailsService.saveAdmissionDetails(admissionDetails);
     return ResponseEntity.status(HttpStatus.CREATED).body(details);
    }

    //getAll
    @GetMapping
    public ResponseEntity<List<AdmissionDetails>> getAll(){
        return ResponseEntity.ok(admissionDetailsService.getAllStudentsAdmissionDetails());
    }

    //getAllBystudentID
    @GetMapping("/students/{studentId}")
     public ResponseEntity<List<AdmissionDetails>> getAllByStudentID(@PathVariable String studentId){
        return ResponseEntity.ok(admissionDetailsService.getAdmissionbyStudentID(studentId));
    }

    @GetMapping("/feeStructure/{studentId}")
     public ResponseEntity<List<AdmissionDetails>> getAllByStudentIDFromFEESManagement(@PathVariable String studentId){
        return ResponseEntity.ok(admissionDetailsService.getAdmissionbyStudentID(studentId));
    }

    //getAllbyRollnum
    // @GetMapping("/students/{roll_Number}")
    //  public ResponseEntity<List<AdmissionDetails>> getAllbyRollnum(@PathVariable String roll_Number){
    //     return ResponseEntity.ok(admissionDetailsService.getAdmissionbyRollNumber(roll_Number));
    // }


}
