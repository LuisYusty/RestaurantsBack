package com.BackRestaurants.Users.infrastructure.out.jpa.adapter;

import com.BackRestaurants.Users.domain.model.UserModel;
import com.BackRestaurants.Users.domain.spi.IUserPersistencePort;
import com.BackRestaurants.Users.infrastructure.out.jpa.entity.UserEntity;
import com.BackRestaurants.Users.infrastructure.out.jpa.mapper.IUserEntityMapper;
import com.BackRestaurants.Users.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserEntityMapper iUserEntityMapper;
    private final IUserRepository iUserRepository;


    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity userEntity = iUserRepository.save(iUserEntityMapper.toEntity(userModel));
        return iUserEntityMapper.toUserModel(userEntity);
    }

    @Override
    public List<UserModel> getAllUsers() {
        List<UserEntity> entityList = iUserRepository.findAll();
        return iUserEntityMapper.toUserModelList(entityList);
    }

    @Override
    public UserModel getUser(Long id) {
        return iUserEntityMapper.toUserModel(iUserRepository.getReferenceById(id));

    }

    @Override
    public void deleteUser(Long id) {

    }


}
