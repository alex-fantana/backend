package com.example.backend.Model.dtos;

import com.example.backend.Model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String username;
    private Role role;

    private boolean active;
    private boolean firstLogin;
}
