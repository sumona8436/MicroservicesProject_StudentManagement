package com.service.studentservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeesManagement {
         private String iD;
         private String studentId;
         private String firstSemesterFee;
         private String secondSemesterFee;
         private String thirdSemesterFee;
         private String fourthSemesterFee;
         private String fifthSemesterFee;
         private String sixthSemesterFee;
         private String seventhSemesterFee;
         private String eighthSemesterFee;
         private String outstanding_Payment;
        
}
