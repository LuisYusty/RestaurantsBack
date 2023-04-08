package com.BackRestaurants.Users.application.mapper;


import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {

    /*@Mappings({
            @Mapping(target="name", source="name"),
            @Mapping(target="lastName", source="lastName"),
            @Mapping(target="idDocument", source="idDocument"),
            @Mapping(target="email", source="email"),
            @Mapping(target="password", source="password")
    })*/
    UserModel toUser(UserRequest userRequest); // UserModel representa un usuario y UserRequest contiene los campos de
                                               // nombre,apellido etc, entonces toUser crea un nuevo usuario (UserModel)
                                               // va "llenando de datos" el UserModel

}
