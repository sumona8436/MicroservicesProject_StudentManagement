package com.service.admissiondetailservice.entity;


import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="admission_detailsof_students")

public class AdmissionDetails {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admissionID")
    private Long admissionID;

     @Column(name = "roll_Number")
    private String roll_Number;

     @Column(name = "studentId")
     private String studentId;

      @Column(name = "admissionNumber")
   private String admissionNumber;

    @Column(name = "branchName")
       private String branchName;

    @Column(name = "dateOfBirth")
   private String dateOfBirth;

    @Column(name = "passoutYear")
   private String passoutYear;

    @Column(name = "joiningYear")
    private String joiningYear;

     @Column(name = "guardianName")
     private String guardianName;

      @Column(name = "address")
      private String address;

      
}
 

