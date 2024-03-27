package com.service.studentservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.studentservice.entities.Students;

public interface StudentsRepository extends JpaRepository<Students,String>{
    //if you want to create any custom method or query
    //write here
}
