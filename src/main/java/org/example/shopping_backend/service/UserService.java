package org.example.shopping_backend.service;


import org.example.shopping_backend.input.UserDataInput;
import org.example.shopping_backend.input.UserRegister;
import org.example.shopping_backend.output.LoginResponse;
import org.example.shopping_backend.output.UserDataOutput;

public interface UserService {
    UserDataOutput register(UserRegister input);
    LoginResponse login(UserDataInput input);
    
}
