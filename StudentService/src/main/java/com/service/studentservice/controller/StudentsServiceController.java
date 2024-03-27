package com.service.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.service.studentservice.entities.Students;
import com.service.studentservice.servicesinterface.Students_Service;

@RestController
@RequestMapping("/students")
public class StudentsServiceController {
    @Autowired
    private Students_Service studentsService;

    //create
    @PostMapping
     public ResponseEntity<Students> createStudentDetails(@RequestBody Students students){
       Students detail= studentsService.saveStudents(students);
       return ResponseEntity.status(HttpStatus.CREATED).body(detail);
     }

    //delete

    //update

    //get all users
    @GetMapping
     public ResponseEntity<List<Students>> getAllDetails(){
         List<Students> allDetails=studentsService.getAllStudents();
         return ResponseEntity.ok(allDetails);
     }



    //getByID 
    @GetMapping("/{roll_number}")
    public ResponseEntity<Students> getDetailsbyID (@PathVariable String roll_number){
       Students details= studentsService.getStudent(roll_number);
       return ResponseEntity.ok(details);
    }
}
