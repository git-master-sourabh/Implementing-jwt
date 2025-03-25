package com.example.securitydemo.jwt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class LoginResponse {


    private String jwtToken;
    private String username;
    private List<String> roles;

    public LoginResponse(String username, String jwtToken, List<String> roles) {
        this.username = username;
        this.jwtToken = jwtToken;
        this.roles = roles;
    }


}
