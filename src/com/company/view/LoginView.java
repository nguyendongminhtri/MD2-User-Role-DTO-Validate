package com.company.view;

import com.company.service.user.UserServiceIMPL;

public class LoginView {
    public LoginView(){
        System.out.println("LOGIN FORM");
        System.out.println("LIST USER SAU KHI THÊM MỚI ---> "+UserServiceIMPL.userList);
    }
}
