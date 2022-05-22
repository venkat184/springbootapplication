package com.simplilearn.devops.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("Venkatesh")
                && password.equalsIgnoreCase("admin@123");
    }

}