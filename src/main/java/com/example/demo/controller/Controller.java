package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public  class Controller  {

    @Autowired
    StudentService studentService;

    @GetMapping("hello")
    public  String name(){
        return  " akash ranjan Verma kuch to bolo";
    }

    @GetMapping("all")

    public List<Student> student(){
        return  studentService.getAll();
    }

    @GetMapping("get/{id}")

    public Optional<Student> byId(@PathVariable int id){
        return  studentService.getById(id);
    }
}