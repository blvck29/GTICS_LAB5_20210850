package com.example.lab5_gticsf.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location {
    @Id
    private Integer LocationID;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
}
