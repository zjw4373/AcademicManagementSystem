package View;

import Controller.ModelMediator;
import Model.Course;

import java.util.Scanner;

public class CommandLineUI {
    public static void init() {
        System.out.println("Welcome to the Academic Management System!\nWhat would you like to do?\n Select an option by number");
        System.out.println("1. Manage Courses");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            System.out.println("What would you with your courses? Select an option by number");
            System.out.println("1. Add a Course");
            int courseInput = Integer.parseInt(scanner.nextLine());
            if (courseInput == 1) {
                System.out.println("Enter course name: ");
                String courseName = scanner.nextLine();
                Course newCourse = ModelMediator.createCourse(courseName);
                System.out.println(String.format("Course %s Created!", newCourse.getName()));
            }
        }
    }
}
