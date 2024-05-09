package com.example.lab5_gticsf.Repository;

import com.example.lab5_gticsf.Entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepo extends JpaRepository<Technician, Integer> {
}
