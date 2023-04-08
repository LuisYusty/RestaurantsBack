package com.BackRestaurants.Users.application.dto.response;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponse {

    private String name;

    private String lastName;

    private String idDocument;

    private String email;

    private String password;
}
