package com.service.feesManagement.controllerClass;

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
import com.service.feesManagement.entity.FeesManagement;
import com.service.feesManagement.serviceImplementClass.FeesManagementService;

@RestController
@RequestMapping("/feeStructure")
public class FeesManagementController {
    @Autowired
    private FeesManagementService feesManagementService;

    @PostMapping
    public ResponseEntity<FeesManagement> saveFeesData(@RequestBody FeesManagement  feesManagement ){
        FeesManagement details=feesManagementService.saveFeesDetails(feesManagement);
        return ResponseEntity.status(HttpStatus.CREATED).body(details);
    }

    @GetMapping
    public ResponseEntity<List<FeesManagement>> getAllData(){
       List<FeesManagement> details= feesManagementService.getAllData();
       return ResponseEntity.ok(details);
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<List<FeesManagement>> getDataStudentId(@PathVariable String studentId){
       List<FeesManagement> details= feesManagementService.getFeesDetailsByStudentID(studentId);
       return ResponseEntity.ok(details);
    }
}
