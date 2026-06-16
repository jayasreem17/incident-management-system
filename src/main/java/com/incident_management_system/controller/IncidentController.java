package com.incident_management_system.controller;

import com.incident_management_system.entity.Incident;
import com.incident_management_system.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incident")
@CrossOrigin(origins = "*")
public class IncidentController {

    @Autowired
    private IncidentService service;

    // CREATE INCIDENT
    @PostMapping("/create")
    public Incident create(@RequestBody Incident incident) {
        return service.createIncident(incident);
    }

    // GET ALL INCIDENTS
    @GetMapping("/all")
    public List<Incident> getAll() {
        return service.getAllIncidents();
    }

    // GET INCIDENT BY ID
    @GetMapping("/{id}")
    public Incident getById(@PathVariable Long id) {
        return service.getIncidentById(id);
    }

    // UPDATE INCIDENT
    @PutMapping("/update/{id}")
    public Incident update(@PathVariable Long id,
                           @RequestBody Incident incident) {
        return service.updateIncident(id, incident);
    }

    // DELETE INCIDENT
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteIncident(id);
        return "Incident deleted successfully";
    }
}