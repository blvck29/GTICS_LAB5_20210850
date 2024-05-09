package com.example.lab5_gticsf.Controller;

import com.example.lab5_gticsf.Entity.Technician;
import com.example.lab5_gticsf.Repository.TechnicianRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AppController {

    final TechnicianRepo technicianRepo;
    public AppController(TechnicianRepo technicianRepo) {
        this.technicianRepo = technicianRepo;
    }

    @GetMapping(value = "")
    public String inicio(){
        return "inicio";
    }
    @GetMapping(value = "tecnicos")
    public String tecnicos(Model model){

        ArrayList<Technician> listaTecnicos = (ArrayList<Technician>) technicianRepo.findAll();
        model.addAttribute("listaTecnicos", listaTecnicos);

        return "tecnicos";
    }

    @GetMapping(value = "estadisticas")
    public String estadisticas(){
        return "estadisticas";
    }

}
