package com.company.view;

import com.company.controller.RoleController;

import java.util.Scanner;

public class RoleView {
    Scanner scanner = new Scanner(System.in);
    RoleController roleController = new RoleController();
    public void showListRole(){
        System.out.println(roleController.findAll());
        System.out.println("Enter quit to come back MENU: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
