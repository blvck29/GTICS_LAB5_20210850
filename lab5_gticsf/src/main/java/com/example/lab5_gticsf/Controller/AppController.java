package com.example.lab5_gticsf.Controller;

import com.example.lab5_gticsf.Entity.Device;
import com.example.lab5_gticsf.Entity.Technician;
import com.example.lab5_gticsf.Repository.DevicesRepo;
import com.example.lab5_gticsf.Repository.TechnicianRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class AppController {

    final TechnicianRepo technicianRepo;
    final DevicesRepo devicesRepo;
    public AppController(TechnicianRepo technicianRepo, DevicesRepo devicesRepo) {
        this.technicianRepo = technicianRepo;
        this.devicesRepo = devicesRepo;
    }

    @GetMapping(value = {"", "/"})
    public String inicio(){
        return "inicio";
    }
    @GetMapping(value = "tecnicos")
    public String tecnicos(Model model){

        ArrayList<Technician> listaTecnicos = (ArrayList<Technician>) technicianRepo.findAll();
        model.addAttribute("listaTecnicos", listaTecnicos);

        return "tecnicos";
    }

    @GetMapping(value = {"/new_tec"})
    public String crearTecnico(@ModelAttribute("tecnico") Technician tecnico, Model model){
        ArrayList<Technician> managerList = (ArrayList<Technician>) technicianRepo.findAll();
        return "tec_new";
    }

    @GetMapping(value = {"/edit_tec"})
    public String editarTecnico(@ModelAttribute("employee") Technician tecnico, Model model, @RequestParam("id") int id){
        Optional<Technician> optEmployee = technicianRepo.findById(id);

        if(optEmployee.isPresent()){
            tecnico = optEmployee.get();
            model.addAttribute("tecnico",tecnico);
            return "tec_new";
        }else{
            return "redirect:/tecnicos";
        }

    }

    @PostMapping("/save_tec")
    public String guardarTecnico(@ModelAttribute("employee") Technician tecnico){

        technicianRepo.save(tecnico);
        return "redirect:/employee";
    }

    @GetMapping(value = "estadisticas")
    public String estadisticas(Model model){

        ArrayList<Device> listaDevices = (ArrayList<Device>) devicesRepo.findAll();
        model.addAttribute("listaDevices",listaDevices);
        return "estadisticas";
    }

}
