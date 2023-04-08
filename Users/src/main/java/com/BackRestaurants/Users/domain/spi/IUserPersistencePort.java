package com.BackRestaurants.Users.domain.spi;

import com.BackRestaurants.Users.domain.model.UserModel;

import java.util.List;

public interface IUserPersistencePort {


    void saveUser(UserModel userModel);

    List<UserModel> getAllUsers();

    UserModel getUser(Long id);

    void deleteUser(Long id);
}
