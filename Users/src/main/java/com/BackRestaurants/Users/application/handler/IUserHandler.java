package com.BackRestaurants.Users.application.handler;

import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.dto.response.UserResponse;


import java.util.List;

public interface IUserHandler {

   // mismos metodos de la api pero con argumentos de esta capa

    void saveUser(UserRequest userRequest);


    List<UserResponse> getAllUsers();

    UserResponse getUser(Long id);

    void deleteUser(Long id);


}
