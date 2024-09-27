package org.example.shopping_backend.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class LoginResponse {
    private boolean isUser;

    public LoginResponse() {
    }

    public LoginResponse(boolean isUser) {
        this.isUser = isUser;
    }

    public boolean isUser() {
        return isUser;
    }

    public void setisUser(boolean user) {
        isUser = user;
    }
}
