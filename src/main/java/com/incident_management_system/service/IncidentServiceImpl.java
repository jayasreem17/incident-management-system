package com.incident_management_system.service;

import com.incident_management_system.entity.Incident;
import com.incident_management_system.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    private IncidentRepository repository;

    @Override
    public Incident createIncident(Incident incident) {
        return repository.save(incident);
    }

    @Override
    public List<Incident> getAllIncidents() {
        return repository.findAll();
    }

    @Override
    public Incident getIncidentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Incident not found with id: " + id));
    }

    @Override
    public Incident updateIncident(Long id, Incident incidentDetails) {
        Incident incident = getIncidentById(id);

        incident.setTitle(incidentDetails.getTitle());
        incident.setDescription(incidentDetails.getDescription());
        incident.setSeverity(incidentDetails.getSeverity());
        incident.setStatus(incidentDetails.getStatus());
        incident.setAssignedEngineer(incidentDetails.getAssignedEngineer());

        return repository.save(incident);
    }

    @Override
    public void deleteIncident(Long id) {
        repository.deleteById(id);
    }
}