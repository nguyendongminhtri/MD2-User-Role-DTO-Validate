package com.company.view;

import java.util.Scanner;

public class Main {
public Main(){

    System.out.println("=======================MY NAVBAR =======================");
    System.out.println("1. REGISTER");
    System.out.println("2. LOGIN");
    System.out.println("3. LIST ROLE");
    Scanner scanner = new Scanner(System.in);
    int choose = scanner.nextInt();
    switch (choose){
        case 1:
            new RegisterView();
            break;
        case 2:
            new LoginView();
            break;
        case 3:
            new RoleView().showListRole();
            break;
    }
}
    public static void main(String[] args) {
        new Main();
    }
}
