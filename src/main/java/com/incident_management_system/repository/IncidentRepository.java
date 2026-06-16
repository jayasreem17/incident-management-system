package com.incident_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incident_management_system.entity.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {

    List<Incident> findByStatus(String status);

    List<Incident> findBySeverity(String severity);

    long countByStatus(String status);
}