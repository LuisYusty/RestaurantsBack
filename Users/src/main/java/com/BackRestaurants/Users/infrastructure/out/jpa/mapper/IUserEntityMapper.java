package com.BackRestaurants.Users.infrastructure.out.jpa.mapper;


import com.BackRestaurants.Users.domain.model.UserModel;
import com.BackRestaurants.Users.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserEntityMapper {

    UserEntity toEntity(UserModel userModel);
    //La firma del método UserEntity toEntity(UserModel userModel);
    // sugiere que este es un método en una clase de mapeador que convierte un UserModel (objeto) en un UserEntity (objeto)


    UserModel toUserModel(UserEntity userEntity);
    List<UserModel> toUserModelList(List<UserEntity> userEntityList);


}
