package com.BackRestaurants.Users.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private  Long id;
    private String name;

    private String lastName;

    private String idDocument;

    private String email;

    private String password;


}
