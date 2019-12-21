package org.example.userDDD.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String mobile;
    private List<UserLogin> userLogins = new ArrayList<>();

    public User(String mobile) {
        this.mobile = mobile;
    }

    public void addLoginType(UserLogin login) {
        if (login == null || login.getIdentityType() == null)
            throw new RuntimeException("parameter invalid");

        if (userLogins.stream().anyMatch(f -> f.getIdentityType().equals(login.getIdentityType())))
            throw new RuntimeException("duplicate identity type");

        userLogins.add(login);
    }
}
