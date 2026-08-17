package com.sinoxolo.taskmanagementAPI.domain.user;

public interface UserRepository {
    User findUserById(UserId id);
    User findUserByName(String username);
    User updateUserInfo(UserId id);
    void deleteUser(UserId id);
}
