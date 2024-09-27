package org.example.shopping_backend.input;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataInput {

    @Size(min = 4, message = "username must be at least 4 character")
    private String username;

    @Size(min = 8, message = "password must be at least 8 character")
    private String password;
}
