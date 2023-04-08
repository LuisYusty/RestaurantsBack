package com.BackRestaurants.Users.domain.usecase;

import com.BackRestaurants.Users.domain.api.IUserServicePort;
import com.BackRestaurants.Users.domain.model.UserModel;
import com.BackRestaurants.Users.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort iUserPersistencePort;

    public UserUseCase(IUserPersistencePort iUserPersistencePort) {
        this.iUserPersistencePort = iUserPersistencePort;
    }

    @Override
    public void saveUser(UserModel userModel) {
        iUserPersistencePort.saveUser(userModel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return iUserPersistencePort.getAllUsers();
    }

    @Override
    public UserModel getUser(Long id) {
        return iUserPersistencePort.getUser(id);
    }

    @Override
    public void deleteUser(Long id) {
        iUserPersistencePort.deleteUser(id);

    }
}
