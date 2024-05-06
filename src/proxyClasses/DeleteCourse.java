package proxyClasses;

import BuilderClasses.Course;
import BuilderClasses.Student;

import java.util.ArrayList;

public class DeleteCourse implements Service {

    @Override
    public String Operation() {
        return null;

    }

    @Override
    public String Operation(Student student, Section section, Course course) {
        return student.deleteCourse(course);
    }
}
