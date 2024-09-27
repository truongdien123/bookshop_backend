package org.example.shopping_backend.mapper;



import org.example.shopping_backend.input.UserDataInput;
import org.example.shopping_backend.input.UserRegister;
import org.example.shopping_backend.model.User;
import org.example.shopping_backend.output.UserDataOutput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRegister input);
    UserDataOutput toUserDataOutput(User user);
}
