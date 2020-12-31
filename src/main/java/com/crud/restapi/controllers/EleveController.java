package com.crud.restapi.controllers;

import com.crud.restapi.Services.EleveService;
import com.crud.restapi.models.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= "http://localhost:4200")

@RestController
public class EleveController {

    @Autowired
    EleveService eleveService;

    @GetMapping("/eleves")
    private List<Eleve> getEleves() {
        return eleveService.getEleves();
    }

    @GetMapping("/eleves/{id}")
    private Eleve getEleve(@PathVariable("id") long eleveId) {
        return eleveService.getEleveById(eleveId);

    }

    @DeleteMapping("/eleves/{id}")
    private void deleveEleve(@PathVariable("id") long eleveId) {
        eleveService.deleteEleveById(eleveId);
    }

    @PostMapping("/eleves")
    private long saveEleve(@RequestBody Eleve eleve) {
        eleveService.saveEleve(eleve);
        return eleve.getId();
    }

    @PutMapping("/eleves/{id}")
    private Eleve updateEleve(@PathVariable("id") long id, @RequestBody Eleve eleve) {
        eleveService.updateEleve(eleve,id);
        return eleve;
    }
}
