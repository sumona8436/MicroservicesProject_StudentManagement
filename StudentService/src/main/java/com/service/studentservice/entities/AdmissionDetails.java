package com.service.studentservice.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AdmissionDetails {
   private String admissionID;
    private String roll_Number;
     private String studentId;
   private String AdmissionNumber;
   private String DateOfBirth;
   private String PassoutYear;
    private String JoiningYear;
     private String GuardianName;
      private String Address;
       private String BranchName;

}
