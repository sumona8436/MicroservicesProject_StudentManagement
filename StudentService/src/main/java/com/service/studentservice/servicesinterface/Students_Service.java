package com.service.studentservice.servicesinterface;

import com.service.studentservice.entities.Students;

import java.util.*;

public interface Students_Service {
    
    //create
     Students saveStudents(Students students);


    //update

    //delete

    //viewByID
    Students getStudent(String Roll_Number);

    //viewAll
    List<Students> getAllStudents();


}
