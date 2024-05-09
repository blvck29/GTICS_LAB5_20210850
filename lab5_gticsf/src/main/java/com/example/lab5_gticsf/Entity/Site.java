package com.example.lab5_gticsf.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
public class Site {
    @Id
    private Integer SiteID;
    @Column(name = "SiteName")
    private String siteName;
    @ManyToOne
    @JoinColumn(name = "LocationID")
    private Location location;
    @Column(name = "InstallationDate")
    private Date installationDate;
    @Column(name = "Latitude")
    private String latitude;
    @Column(name = "Longitude")
    private String longitude;
}
