package com.service.admissiondetailservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

import com.service.admissiondetailservice.entity.AdmissionDetails;

public interface AdmissionDetailsRepository extends JpaRepository<AdmissionDetails,String> {
    //custom hibernate sql query
    List<AdmissionDetails> findByStudentId(String  studentId);
   // List<AdmissionDetails> findByRoll_Number(String  roll_Number);
   @Query("SELECT a FROM AdmissionDetails a WHERE a.roll_Number = :roll_Number")
List<AdmissionDetails> findByRollNumber(@Param("roll_Number") String roll_Number);

}
