package com.sinoxolo.taskmanagementAPI.domain.project;

import com.sinoxolo.taskmanagementAPI.domain.user.User;
import com.sinoxolo.taskmanagementAPI.domain.user.UserId;

public interface ProjectRepository {
    Project findProjectById(ProjectId id);
    Project findProjectByName(String name);
    Project findProjectByDescription(String description);
    User findProjectLeadById(UserId leadId);
    Project updateProjectDescription(ProjectId id);
    void deleteProject(ProjectId id);
}
