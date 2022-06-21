package com.company.controller;

import com.company.configs.HibernateConfigurer;
import com.company.services.auth.AuthService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import uz.jl.BaseUtils;
import uz.jl.Colors;

public class AuthController {

    public static void checkPasswordAndEmail(String email, String password) {
        if (email == null || email.trim().isEmpty()) {
            BaseUtils.print("Invalid input was provided", Colors.RED);
            return;
        }
        if (password == null || password.trim().isEmpty()) {
            BaseUtils.print("Invalid input was provided", Colors.RED);
            return;
        }
        String result = AuthService.checkPasswordAndEmail(email, password);

    }
}
