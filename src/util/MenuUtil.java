package util;

import main.Configuration;
import main.Student;

public class MenuUtil {

    public static void printAllStudent() {
        if (Configuration.students == null){
            System.out.println("You do not have any Student");
            return;
        }
        System.out.println("Student that you have registered: ");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student student = Configuration.students[i];
            System.out.println((1 + i) + ".Student \n" + student.getInfo());
        }

    }

    public static void registerStudent() {
        int count = InputUtil.enterInteger("How many Student do you want to Register?");
        Configuration.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Registration");
            Student student = InputUtil.fill();
            Configuration.students[i] = student;
        }

    }
    public static void findStudent() {
        String find = InputUtil.enterString("Enter name or surname that you want to find:");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student student = Configuration.students[i];
            if (student.getName().equalsIgnoreCase(find) || student.getSurname().equalsIgnoreCase(find)) {
                System.out.println(student.getInfo());

            }
        }
    }

    public static void updateStudent() {
        int student_place = InputUtil.enterInteger("In which student you want to do your update?");
        System.out.println("Enter new Information");
        Student student = InputUtil.fill();
        Configuration.students[student_place -1] = student;
        System.out.println(student.getInfo());
    }
}
