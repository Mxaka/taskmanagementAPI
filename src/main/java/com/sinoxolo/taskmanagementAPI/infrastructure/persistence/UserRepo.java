package com.sinoxolo.taskmanagementAPI.infrastructure.persistence;

import com.sinoxolo.taskmanagementAPI.domain.user.User;
import com.sinoxolo.taskmanagementAPI.domain.user.UserId;
import com.sinoxolo.taskmanagementAPI.domain.user.UserRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserRepository {
    private JdbcTemplate template;

    public UserRepo(JdbcTemplate template) {
        this.template = template;
    }


    @Override
    public User findUserById(UserId id) {
        return null;
    }

    @Override
    public User findUserByName(String username) {
        return null;
    }

    @Override
    public User updateUserInfo(UserId id) {
        return null;
    }

    @Override
    public void deleteUser(UserId id) {

    }
}
