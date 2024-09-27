package org.example.shopping_backend.service.imp;


import org.example.shopping_backend.exception.BadRequestException;
import org.example.shopping_backend.exception.NotFoundException;
import org.example.shopping_backend.input.UserDataInput;
import org.example.shopping_backend.input.UserRegister;
import org.example.shopping_backend.mapper.UserMapper;
import org.example.shopping_backend.model.User;
import org.example.shopping_backend.output.LoginResponse;
import org.example.shopping_backend.output.UserDataOutput;
import org.example.shopping_backend.repository.UserRepository;
import org.example.shopping_backend.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImp(UserRepository userRepository, UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDataOutput register(UserRegister input) {
        if (!input.getPassword().equals(input.getConfirmPassword())){
            throw new BadRequestException("Password confirm is not the same with password");
        }
        User user = userMapper.toUser(input);
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        userRepository.save(user);
        return userMapper.toUserDataOutput(user);
    }

    @Override
    public LoginResponse login(UserDataInput input) {
        User user = userRepository.findByUsername(input.getUsername())
                .orElseThrow(() -> new NotFoundException("Username is not existed"));
        LoginResponse loginResponse = new LoginResponse();
        if(!passwordEncoder.matches(input.getPassword(), user.getPassword())){
            throw new NotFoundException("Password is wrong");
        }
        loginResponse.setisUser(true);
        return loginResponse;
    }
}
