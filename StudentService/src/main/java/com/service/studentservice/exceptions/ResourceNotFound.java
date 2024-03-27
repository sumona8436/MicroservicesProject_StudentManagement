package com.service.studentservice.exceptions;

public class ResourceNotFound  extends RuntimeException{
//Can add extra properties

    public ResourceNotFound(){
        super("Resource Not Found on Server!!!!!"); 
    }

    public ResourceNotFound(String message){
        super(message); 
    }

}
