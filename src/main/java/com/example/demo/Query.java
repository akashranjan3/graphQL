package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	StudentService studentService;


	public String firstQuery () {
		return "First Query";
	}
	
	public String secondQuery () {
		return "Second Query";
	}

	public String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public String showHuman (GoodHuman goodHuman) {
		return goodHuman.firstName + " " + goodHuman.lastName + " is a good human.";
	}

	public Student student(int id){
		Optional<Student> stu = studentService.getById(id);
		if(stu.isPresent())
			return stu.get();
		else
		return  new Student();
	}

	public List<Student> studentAll(){
		return  studentService.getAll();
	}
}
