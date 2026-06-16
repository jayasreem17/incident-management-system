package com.incident_management_system.service;

import com.incident_management_system.entity.Incident;
import java.util.List;

public interface IncidentService {

    Incident createIncident(Incident incident);

    List<Incident> getAllIncidents();

    Incident getIncidentById(Long id);

    Incident updateIncident(Long id, Incident incident);

    void deleteIncident(Long id);
}