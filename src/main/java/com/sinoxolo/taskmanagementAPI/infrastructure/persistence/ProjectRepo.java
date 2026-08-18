package com.sinoxolo.taskmanagementAPI.infrastructure.persistence;

import com.sinoxolo.taskmanagementAPI.domain.project.Project;
import com.sinoxolo.taskmanagementAPI.domain.project.ProjectId;
import com.sinoxolo.taskmanagementAPI.domain.project.ProjectRepository;
import com.sinoxolo.taskmanagementAPI.domain.user.User;
import com.sinoxolo.taskmanagementAPI.domain.user.UserId;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepo implements ProjectRepository {
    private JdbcTemplate template;

    public ProjectRepo(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Project findProjectById(ProjectId id) {
        return null;
    }

    @Override
    public Project findProjectByName(String name) {
        return null;
    }

    @Override
    public Project findProjectByDescription(String description) {
        return null;
    }

    @Override
    public User findProjectLeadById(UserId leadId) {
        return null;
    }

    @Override
    public Project updateProjectDescription(ProjectId id) {
        return null;
    }

    @Override
    public void deleteProject(ProjectId id) {

    }
}
