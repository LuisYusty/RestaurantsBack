package com.BackRestaurants.Users.infrastructure.input.rest;


import com.BackRestaurants.Users.application.dto.request.UserRequest;
import com.BackRestaurants.Users.application.dto.response.UserResponse;
import com.BackRestaurants.Users.application.handler.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler iUserHandler;

    @PostMapping("")
    public void saveUser(@RequestBody UserRequest userRequest) {
        iUserHandler.saveUser(userRequest);

    }

    @GetMapping("/get/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        return  iUserHandler.getUser(id);
    }

    @GetMapping("/getAll/")
    public List<UserResponse> getAllUser() {
        return  iUserHandler.getAllUsers();
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        iUserHandler.deleteUser(id);
    }
/*
    @GetMapping("/get/")
    public ResponseEntity<List<UserResponse>> getAllUser() {
        return ResponseEntity.ok(iUserHandler.getAllUser());
    }
 */

}
