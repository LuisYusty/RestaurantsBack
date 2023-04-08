package com.BackRestaurants.Users.infrastructure.input.rest;


import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.handler.IUserHandler;
import com.BackRestaurants.Users.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler iUserHandler;

    @PostMapping("")
    public ResponseEntity<Void> saveUser(@RequestBody UserRequest userRequest) {
        iUserHandler.saveUser(userRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return  ResponseEntity.ok(iUserHandler.getUser(id));
    }


}
