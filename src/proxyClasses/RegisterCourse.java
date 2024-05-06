package proxyClasses;
import BuilderClasses.*;
public class RegisterCourse implements Service{
    Student Student;
    Course Course;
    Section Section;

    @Override
    public void Operation(Student student, Section section, Course course) {
        if (student.getMajor().equalsIgnoreCase(course.getMajor())) {
            if (student.getTerm()==course.getTerm()) {
                student.registerCourse(section.getCourse(), section);
            }
        } else
            System.out.println("Failed");
    }

    @Override
    public void Operation() {
        
    }
}
