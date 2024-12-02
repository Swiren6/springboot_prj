package com.securite.securite.Requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.Set;
@Getter
public class SignupRequest {
    @NotBlank
    @Size(min = 2, max = 20)
    private String username;

    @NotBlank
    @Size(max= 50)
    @Email
    private String email;

    private Set<String> roles;

    @NotBlank
    @Size(min= 6, max = 40)
    private String password;
}
