package com.BackRestaurants.Users.application.handler;

import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.dto.response.UserResponse;


import java.util.List;

public interface IUserHandler {



    void saveUser(UserRequest userRequest);

    List<UserResponse> getAllUsers();

    UserResponse getUser(Long id);

    void deleteUser(Long id);
}
