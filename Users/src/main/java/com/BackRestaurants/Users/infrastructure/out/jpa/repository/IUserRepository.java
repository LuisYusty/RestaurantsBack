package com.BackRestaurants.Users.infrastructure.out.jpa.repository;

import com.BackRestaurants.Users.domain.model.UserModel;
import com.BackRestaurants.Users.infrastructure.out.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository <UserEntity, Long> {
}
