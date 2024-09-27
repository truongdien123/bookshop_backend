package org.example.shopping_backend.controller;



import org.example.shopping_backend.base.ResponseUtil;
import org.example.shopping_backend.input.UserDataInput;
import org.example.shopping_backend.input.UserRegister;
import org.example.shopping_backend.output.LoginResponse;
import org.example.shopping_backend.output.UserDataOutput;
import org.example.shopping_backend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegister input){
        UserDataOutput userDataOutput = userService.register(input);
        return ResponseUtil.success(userDataOutput.getUsername());
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDataInput input){
        LoginResponse loginResponse = userService.login(input);
        return ResponseUtil.success(loginResponse);
    }
}
