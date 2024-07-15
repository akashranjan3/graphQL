package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> getById(int id){
        return  studentRepository.findById(id);
    }
}
