package Controller;

import Model.Course;

import java.util.ArrayList;
import java.util.List;

public class ModelMediator {
    private static List<Course> courses = new ArrayList<Course>();

    public static Course createCourse(String name) {
        Course course = new Course(name);
        courses.add(course);
        return course;
    }
}
