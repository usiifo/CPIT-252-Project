package proxyClasses;

import BuilderClasses.*;

public class BrowseCourses implements Service {
    //we need this to know the term.
    

    public BrowseCourses() {
    }
    
    

    @Override
    public String Operation(Student student, Section section, Course course) {
        String Result = "";
        for (Course course1: Course.courses){
            // check courses that matches the students major, term
            if (course1.getTerm() == student.getTerm() && course1.getMajor().equalsIgnoreCase(student.getMajor())) {
                //we could add more conditions in the if statement.
                Result+= "Course name is " + course1.getName() + ", Course Code is:" + course1.getCode() + ", Hours: "+ course1.getHours();
                Result+= "\n";
                Result += course1.getSections();
                
            }
            
        }
        return Result;
    }

    @Override
    public String Operation() {
        return null;
    }
}
