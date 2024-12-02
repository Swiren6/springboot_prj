package com.example.demo.Response;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String refreshToken;
    private Long id;
    private String email;
    private String userName;
    private List<String> roles;

    public JwtResponse(String accessToken, String refreshToken, Long id, String email, String userName, List<String> roles) {
        this.token = accessToken;
        this.refreshToken = refreshToken;
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.roles = roles;
    }
}
