package com.BackRestaurants.Users.infrastructure.out.jpa.adapter;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleJpaAdapter implements IRolePersistencePort {

    private final IRoleRepository iRoleRepository;

    public RoleJpaAdapter(IRoleRepository iRoleRepository) {
        this.iRoleRepository = iRoleRepository;
    }

    @Override
    public List<RoleModel> getAllRoles() {
        return iRoleRepository.findAll();
    }
}
