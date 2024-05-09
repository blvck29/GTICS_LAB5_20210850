package com.example.lab5_gticsf.Entity;

import com.example.lab5_gticsf.Repository.TechnicianRepo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
public class Ticket {
    @Id
    private Integer TicketID;
    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site site;
    @ManyToOne
    @JoinColumn(name = "TechnicianID")
    private Technician technician;
    @Column(name = "Status")
    private String status;
    @Column(name = "OpenedDate")
    private Date openedDate;
    @Column(name = "ClosedDate")
    private Date closedDate;
}
