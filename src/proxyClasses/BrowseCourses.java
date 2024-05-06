package proxyClasses;

import BuilderClasses.*;

public class BrowseCourses implements Service {
    //we need this to know the term.
    

    public BrowseCourses() {
    }
    
    

    @Override
    public void Operation(Student student, Section section, Course course) {
        for (Course course1: Course.courses){
            // check courses that matches the students major, term
            if (course1.getTerm() == student.getTerm() && course1.getMajor().equalsIgnoreCase(student.getMajor())) {
                //we could add more conditions in the if statement.
                String s = "";
                s+= "Course name is " + course1.getName() + ", Course Code is:" + course1.getCode() + ", Hours: "+ course1.getHours();
                System.out.println(s);
                course1.getSections();
            }
        }
    }

    @Override
    public void Operation() {
        
    }
}
