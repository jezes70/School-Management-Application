package main;

import util.InputUtil;
import util.MenuUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the School operation System");


       while (true) {
        int operation = InputUtil.enterInteger("What do you want to do?" +
                "\n1:Register Student" +
                "\n2:Show all Student" +
                "\n3:Find Student" +
                "\n4:Update Student" +
                "\n0:To Exit");
        if (operation == 1) {
            MenuUtil.registerStudent();
        } else if (operation == 2) {
            MenuUtil.printAllStudent();
        } else if (operation == 3) {
            MenuUtil.findStudent();
        } else if (operation == 4) {
            MenuUtil.updateStudent();
        } else if (operation == 0) {
            System.out.println("Exit from the operation");
            break;
        } else {
            System.out.println("Invalid operation");
            break;
        }

       }
       }
    }

