package com.example.lab5_gticsf.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Technician {
    @Id
    private Integer TechnicianID;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Dni")
    private String dni;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Age")
    private  Integer age;
}
