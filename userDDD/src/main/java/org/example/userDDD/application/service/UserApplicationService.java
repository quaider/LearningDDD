package org.example.userDDD.application.service;

import org.example.userDDD.application.vo.RegisterModel;
import org.example.userDDD.domain.entity.User;
import org.example.userDDD.domain.entity.UserLogin;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.concurrent.*;

public class UserApplicationService {

    public void register(RegisterModel registerModel) {
        if (registerModel == null || StringUtils.isEmpty(registerModel.getMobile()) || StringUtils.isEmpty(registerModel.getPassword()))
            throw new RuntimeException("invalid arguments");

        User u = new User(registerModel.getMobile());
        UserLogin login = UserLogin.fromMobile(registerModel.getMobile(), registerModel.getPassword());
        u.addLoginType(login);
    }

    public void modifyProfile() throws InterruptedException {
    }

    public void modifyPassword() {

    }

    static class MyDelay implements Delayed {

        @Override
        public long getDelay(TimeUnit unit) {
            return 1000;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }
}
