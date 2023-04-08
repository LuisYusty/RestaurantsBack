package com.BackRestaurants.Users.infrastructure.configuration;

import com.BackRestaurants.Users.domain.api.IUserServicePort;
import com.BackRestaurants.Users.domain.spi.IUserPersistencePort;
import com.BackRestaurants.Users.domain.usecase.UserUseCase;
import com.BackRestaurants.Users.infrastructure.out.jpa.adapter.UserJpaAdapter;
import com.BackRestaurants.Users.infrastructure.out.jpa.mapper.IUserEntityMapper;
import com.BackRestaurants.Users.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserRepository iUserRepository;
    private final IUserEntityMapper iUserEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(iUserEntityMapper, iUserRepository);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }
}