package com.testing.learning.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO { //Solo se expone lo que el cliente necesita ver

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String website;
    private String username;
    private Integer followers;
    private Integer following;
}
