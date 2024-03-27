package com.service.studentservice.implementClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.studentservice.entities.Students;
import com.service.studentservice.exceptions.ResourceNotFound;
import com.service.studentservice.repositories.StudentsRepository;
import com.service.studentservice.servicesinterface.Students_Service;

import java.util.*;

@Service
public class StudentsServiceImpl implements Students_Service{

    @Autowired
    private StudentsRepository  studentsRepository;


    @Override
    public Students saveStudents(Students students) {
        //it'll generate a unique userId
        String randomStudentsID=UUID.randomUUID().toString();
        students.setStudentId(randomStudentsID);

        return studentsRepository.save(students);
       
    }

    @Override
    public Students getStudent(String roll_Number) {
       return studentsRepository.findById(roll_Number).orElseThrow(() -> new ResourceNotFound("Student ID is not found on Server:  "+ roll_Number));
       
    }

    @Override
    public List<Students> getAllStudents() {
      return  studentsRepository.findAll();
    }
    
}
