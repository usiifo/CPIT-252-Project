package proxyClasses;
import BuilderClasses.*;
public class RegisterCourse implements Service{
    Student Student;
    Course Course;
    Section Section;

    @Override
    public String Operation(Student student, Section section, Course course) {
        if (student.getMajor().equalsIgnoreCase(course.getMajor())) {
            if (student.getTerm()==course.getTerm()) {
                return student.registerCourse(section.getCourse(), section);
            }
            else return "Failed";
        } else
            return "Failed";
    }

    @Override
    public String Operation() {
        return null;
    }
}
