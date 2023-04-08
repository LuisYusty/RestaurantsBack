package com.BackRestaurants.Users.infrastructure.configuration;

import com.BackRestaurants.Users.infrastructure.out.jpa.adapter.RoleJpaAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IRoleRepository iRoleRepository;


    @Bean
    public IRolePersistencePort iRolePersistencePort() {
        return new RoleJpaAdapter(iRoleRepository);
    }

    @Bean
    public IRoleServicePort iroleServicePort() {
        return new RoleUseCase(iRolePersistencePort());
    }
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