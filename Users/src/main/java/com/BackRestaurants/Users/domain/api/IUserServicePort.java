package com.BackRestaurants.Users.domain.api;

import com.BackRestaurants.Users.domain.model.UserModel;

import java.util.List;

public interface IUserServicePort {


    void saveUser(UserModel userModel);

    List<UserModel>getAllUsers();

    UserModel getUser(Long id);

    void deleteUser(Long id);
}
