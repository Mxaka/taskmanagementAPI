package com.sinoxolo.taskmanagementAPI.webcontrollers.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginResponse {
    private String jwtToken;
    private String username;
    private List<String> roles = new ArrayList<>();

    public LoginResponse(String jwtToken, String username, List<String> roles) {
        this.jwtToken = jwtToken;
        this.username = username;
        this.roles = roles;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
