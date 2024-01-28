package util;

import main.Student;

import java.util.Scanner;

public class InputUtil {

    public static int enterInteger(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }

    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;

    }

    public static Student fill() {
        String name = InputUtil.enterString("Enter Student name:");
        String surname = InputUtil.enterString("Enter Student surname:");
        int age = InputUtil.enterInteger("Enter Student age:");
        String className = InputUtil.enterString("Enter Student class name");
        return new Student(name, surname, age, className);

    }

    public static void main(String[] args) {

    }
}
