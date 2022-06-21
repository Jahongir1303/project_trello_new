package com.company;


import com.company.controller.AuthController;
import com.company.doamins.auth.AuthBoard;
import com.company.doamins.auth.Session;
import com.company.services.auth.AuthService;
import uz.jl.BaseUtils;
import uz.jl.Colors;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        if (Objects.isNull(Session.sessionUser)) {
            BaseUtils.println("Welcome to Trello!", Colors.PURPLE);
            BaseUtils.println("Choose one of the options below: ");
            BaseUtils.println("1.Login");
            BaseUtils.println("2.Registration");
            BaseUtils.println("3.Quit");
            String option = BaseUtils.readText("Option: ");

            switch (option) {
                case "1": {
                    String email = BaseUtils.readText("Enter email address: ");
                    String password = BaseUtils.readText("Enter password: ");
                    AuthController.checkPasswordAndEmail(email, password);
                }
                break;
                case "2": {
                    String email = BaseUtils.readText("Enter email address: ");

                }

            }
        } else {
            if (Session.sessionUser.getRole().equals("ADMIN")) {

            } else {

            }
        }

    }
}
