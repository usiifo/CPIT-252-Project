package MainProgram;

import BuilderClasses.*;
import proxyClasses.*;
import stateClasses.notFullState;

public class Main {
    public static void main(String[] args) {
        courseBuilder courseBuilder = new Course(7, "Cloud Computing", "CPCS221", "Computer Eng", 3);
        courseDirector courseDirector = new courseDirector(courseBuilder);
        courseDirector.makeCourse();
        courseBuilder courseBuilder2 = new Course(4, "Database 1", "CPIT440", "Information Technology", 3);
        courseDirector courseDirector2 = new courseDirector(courseBuilder2);
        courseDirector2.makeCourse();
        courseBuilder courseBuilder3 = new Course(4, "Software Engineering", "CPIT251", "Information Technology", 3);
        courseDirector courseDirector3 = new courseDirector(courseBuilder3);
        courseDirector3.makeCourse();
        courseBuilder courseBuilder4 = new Course(4, "Computer Architecture ", "CPIT210", "Information Technology", 3);
        courseDirector courseDirector4 = new courseDirector(courseBuilder4);
        courseDirector4.makeCourse();
        Course course = courseDirector.getCourse();
        Course course2 = courseDirector2.getCourse();
        Course course3 = courseDirector3.getCourse();
        Course course4 = courseDirector4.getCourse();

        studentBuilder studentBuilder = new Student("Aj", 2135813,"A", "yab", "Computer Eng", 7);
        studentDirector studentDirector= new studentDirector(studentBuilder);
        studentDirector.createStudent();


        studentBuilder studentBuilder2 = new Student("Yousef Bogari", 2136374,"AB", "you", "Information Technology", 4);
        studentDirector studentDirector2= new studentDirector(studentBuilder2);
        studentDirector2.createStudent();

        Section section = new Section("CS1",14, course, new notFullState());
        course.addSection(section);

        Section section1 = new Section("CS2", 15, course, new notFullState());
        course.addSection(section1);

        Section section3 = new Section("IT1", 15, course2, new notFullState());
        course2.addSection(section3);

        Section section4 = new Section("IT1", 15, course3, new notFullState());
        course3.addSection(section4);

        Section section5 = new Section("IT1", 15, course4, new notFullState());
        course4.addSection(section5);

        Section section6 = new Section("IT2", 15, course4, new notFullState());

        course4.addSection(section6);
        System.out.println(course);


        

        Controller controller = new Controller();
        controller.Start();
    }
}