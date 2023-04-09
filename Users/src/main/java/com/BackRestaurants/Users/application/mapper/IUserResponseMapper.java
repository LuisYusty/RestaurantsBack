package com.BackRestaurants.Users.application.mapper;


import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.dto.response.UserResponse;
import com.BackRestaurants.Users.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {

    @Mappings({
            @Mapping(target="name", source="name"),
            @Mapping(target="lastName", source="lastName"),
            @Mapping(target="idDocument", source="idDocument"),
            @Mapping(target="email", source="email"),
            @Mapping(target="password", source="password")
    })
    UserResponse toResponse(UserModel userModel);

    List<UserResponse> toResponseList(List<UserModel> objectModelList);

   // indica que se espera que el método tome una lista de objetos UserModel como entrada y devuelva
    // una lista de objetos UserResponse como resultado
}
