package com.sinoxolo.taskmanagementAPI.infrastructure.persistence;

import com.sinoxolo.taskmanagementAPI.domain.task.TaskRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepo implements TaskRepository {
    private JdbcTemplate template;

    public TaskRepo(JdbcTemplate template) {
        this.template = template;
    }


}
