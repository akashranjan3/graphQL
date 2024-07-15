package com.example.demo.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String LastName;

    @Column(name = "location")
    String location;

    @Column(name = "dob")
    String dob;

}
