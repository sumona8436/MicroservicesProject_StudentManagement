package com.service.feesManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="fees_management_table")
public class FeesManagement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iD")
    private Long iD;

         @Column(name = "studentId")
         private String studentId;

         @Column(name = "firstSemesterFee")
         private String firstSemesterFee;

         @Column(name = "secondSemesterFee")
         private String secondSemesterFee;

         @Column(name = "thirdSemesterFee")
         private String thirdSemesterFee;

         @Column(name = "fourthSemesterFee")
         private String fourthSemesterFee;

         @Column(name = "fifthSemesterFee")
         private String fifthSemesterFee;

         @Column(name = "sixthSemesterFee")
         private String sixthSemesterFee;

         @Column(name = "seventhSemesterFee")
         private String seventhSemesterFee;

         @Column(name = "eighthSemesterFee")
         private String eighthSemesterFee;

         @Column(name = "outstanding_Payment")
         private String outstanding_Payment;

}
