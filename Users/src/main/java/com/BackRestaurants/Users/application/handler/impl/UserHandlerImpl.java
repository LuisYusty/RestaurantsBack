package com.BackRestaurants.Users.application.handler.impl;

import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.dto.response.UserResponse;
import com.BackRestaurants.Users.application.handler.IUserHandler;
import com.BackRestaurants.Users.application.mapper.IUserRequestMapper;
import com.BackRestaurants.Users.application.mapper.IUserResponseMapper;
import com.BackRestaurants.Users.domain.api.IUserServicePort;
import com.BackRestaurants.Users.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // crea un constructor
@Transactional
public class UserHandlerImpl implements IUserHandler {

    private final IUserServicePort iUserServicePort;
    private final IUserRequestMapper iUserRequestMapper;
    private final IUserResponseMapper iUserResponseMapper;

    @Override
    public void saveUser(UserRequest userRequest) {
        UserModel userModel = iUserRequestMapper.toUser(userRequest);
        iUserServicePort.saveUser(userModel);

        //El método primero usa un mapeador de objetos llamado UserRequestMapper para convertir el UserRequest (objeto)
        // en un UserModel (objeto). Luego, llama a un método nombrado saveUser en un puerto llamado userServicePort para guardar
        // el userModel (objeto).
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return iUserResponseMapper.toResponseList(iUserServicePort.getAllUsers());
        //La implementación del método getAllUsers() simplemente llama al método getAllUsers()
        // del puerto iUserServicePort para obtener una lista de objetos UserModel que representan
        // todos los usuarios en la aplicación, y luego utiliza el objeto iUserResponseMapper para
        // convertir cada objeto UserModel en un objeto UserResponse. Finalmente, devuelve una lista
        // de objetos UserResponse que contienen la información de todos los usuarios en la aplicación.
    }

    @Override
    public UserResponse getUser(Long id) {
       UserModel userModel = iUserServicePort.getUser(id);
       return iUserResponseMapper.toResponse(userModel);

    }

    @Override
    public void deleteUser(Long id) {
        UserModel userModel = iUserServicePort.getUser(id); // traemos el pokemon para verificar que exista
        iUserServicePort.deleteUser(id);
    }


}
