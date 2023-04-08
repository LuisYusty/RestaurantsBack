package com.BackRestaurants.Users.infrastructure.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    /*
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort objectServicePort() {
        return new UserUseCase(userPersistencePort());
    }*/
}