package com.example.lab5_gticsf.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Device {

    @Id
    private Integer DeviceID;
    @Column(name = "DeviceName")
    private String deviceName;
    @Column(name = "DeviceType")
    private String deviceType;
    @Column(name = "Model")
    private String model;
    @Column(name = "SerialNumber")
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site site;
}
