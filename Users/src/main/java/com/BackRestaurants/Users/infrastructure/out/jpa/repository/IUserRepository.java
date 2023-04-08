package com.BackRestaurants.Users.infrastructure.out.jpa.repository;

import com.BackRestaurants.Users.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository <UserModel, Long> {
}
