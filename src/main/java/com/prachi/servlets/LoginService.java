package com.prachi.servlets;

import java.util.Objects;

public class LoginService {

    public boolean isUserValid(String userName, String userPass) {
        return Objects.equals(userName, "Prachi") && Objects.equals(userPass, "dummy");
    }
}
