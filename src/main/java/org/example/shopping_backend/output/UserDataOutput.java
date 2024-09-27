package org.example.shopping_backend.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataOutput {
    private String username;
    private String address;
    private String phoneNumber;
}
