package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
     @Autowired     
     private StudentRepository stu;
     
     public Student savedetails(Student s)
     {
    	 return stu.save(s);
     }
     public List<Student> getAllDetails()
     {
    	 List<Student> arr = new ArrayList<>();
    	 arr=stu.findAll();
    	 return arr;   
    	 }
     
    
}