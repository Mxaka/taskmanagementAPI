package com.sinoxolo.taskmanagementAPI.domain.project;

import com.sinoxolo.taskmanagementAPI.domain.user.UserId;

import java.util.Date;

public class Project {
    private ProjectId id;
    private String name;
    private String description;
    private UserId leadId;
    private Date createdAt;

    public Project(ProjectId id, String name, String description, UserId leadId, Date createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.leadId = leadId;
        this.createdAt = createdAt;
    }

    public ProjectId getId() {
        return id;
    }

    public void setId(ProjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserId getLeadId() {
        return leadId;
    }

    public void setLeadId(UserId leadId) {
        this.leadId = leadId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
