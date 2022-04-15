package com.company.view;

import com.company.controller.AuthController;
import com.company.dto.request.SignUpDTO;
import com.company.service.user.UserServiceIMPL;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class RegisterView {
    AuthController authController = new AuthController();
    UserServiceIMPL userServiceIMPL = new UserServiceIMPL();
    public RegisterView(){

            System.out.println("FORM REGISTER");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name: ");
            String name = scanner.nextLine();
        String username;
        boolean checkUsername;
        while (true){
                System.out.println("Enter the username: ");
                username = scanner.nextLine();
                checkUsername = Pattern.matches("[a-z0-9_-]{6,}",username);
                if(checkUsername){
                    System.err.println("Username is failed!Please try again!");
                } else if(userServiceIMPL.existedByUsername(username)){
                    System.err.println("Username is existed! Please try again!");
                } else {
                    break;
                }
            }
            System.out.println("Enter the password: ");
            String password = scanner.nextLine();
            System.out.println("Enter the role: ");
            String role = scanner.nextLine();
            Set<String> strRole = new HashSet<>();
            strRole.add(role);
            SignUpDTO signUpDTO = new SignUpDTO(name,username,password,strRole);
            authController.register(signUpDTO);

    }
}
