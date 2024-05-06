package proxyClasses;

import BuilderClasses.Course;
import BuilderClasses.Student;

import java.util.ArrayList;

public class DeleteCourse implements Service {

    @Override
    public void Operation() {

    }

    @Override
    public void Operation(Student student, Section section, Course course) {
        student.deleteCourse(course);
        System.out.println("Deleted Successful.");
    }
}
