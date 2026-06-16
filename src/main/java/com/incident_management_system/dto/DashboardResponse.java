package com.incident_management_system.dto;

public class DashboardResponse {

    private long totalIncidents;
    private long openIncidents;
    private long resolvedIncidents;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalIncidents, long openIncidents, long resolvedIncidents) {
        this.totalIncidents = totalIncidents;
        this.openIncidents = openIncidents;
        this.resolvedIncidents = resolvedIncidents;
    }

    public long getTotalIncidents() {
        return totalIncidents;
    }

    public void setTotalIncidents(long totalIncidents) {
        this.totalIncidents = totalIncidents;
    }

    public long getOpenIncidents() {
        return openIncidents;
    }

    public void setOpenIncidents(long openIncidents) {
        this.openIncidents = openIncidents;
    }

    public long getResolvedIncidents() {
        return resolvedIncidents;
    }

    public void setResolvedIncidents(long resolvedIncidents) {
        this.resolvedIncidents = resolvedIncidents;
    }
}