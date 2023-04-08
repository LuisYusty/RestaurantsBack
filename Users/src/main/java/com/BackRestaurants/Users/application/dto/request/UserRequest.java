package com.BackRestaurants.Users.application.dto.request;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UserRequest {

    private String name;

    private String lastName;

    private String idDocument;

    private String email;

    private String password;
}
