package com.sinoxolo.taskmanagementAPI.domain.task;

import com.sinoxolo.taskmanagementAPI.domain.project.ProjectId;
import com.sinoxolo.taskmanagementAPI.domain.user.UserId;

import java.util.Date;

public class Task {
    private TaskId id;
    private String title;
    private String description;
    private TaskStatus status;
    private Priority priority;
    private DueDate dueDate;
    private UserId ownerId;
    private ProjectId projectId;
    private Date createdAt;
    private Date updatedAt;
    private String version;

    public Task(TaskId id, String title, String description, TaskStatus status, Priority priority, DueDate dueDate,
                UserId ownerId, ProjectId projectId, Date createdAt, Date updatedAt, String version) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
        this.ownerId = ownerId;
        this.projectId = projectId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    public TaskId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public UserId getOwnerId() {
        return ownerId;
    }

    public ProjectId getProjectId() {
        return projectId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getVersion() {
        return version;
    }
}
