package com.service.studentservice.entities;


import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="students_details")
public class Students {
    @Id
    @Column(name = "studentId")
    private String studentId;

    @Column(name = "roll_Number")
    private String roll_Number;

    @Column(name = "degree_Name")
    private String degree_Name;

    @Column(name = "placed_Status")
    private String placed_Status;

    @Column(name = "numberOfBacklog")
    private String numberOfBacklog;

    @Column(name = "fees_Status")
    private String fees_Status;

    @Transient
    private List<AdmissionDetails> admissionDetails=new ArrayList<>();

     @Transient
    private List<FeesManagement> feesManagement=new ArrayList<>();
}
