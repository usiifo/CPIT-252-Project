package proxyClasses;

import BuilderClasses.*;

public class BrowseSections implements Service{
    //we need this to know the term.
    //this service , will browse through the sections in a specific Course

    @Override
    public void Operation(Student student, Section section, Course course) {
        //here we will find print all the sections related to the given course.
        System.out.println(course.getName());
        System.out.println(course.sections.isEmpty());
        for (Section Currentsection: course.sections){
            
            
            System.out.print("Section name is : "+ Currentsection.Name+ " ");
            System.out.println("Number of Seats Available: "+ Currentsection.Seats + " ");
            
        }
        
        }
    
    
//    public void Operation(Student student, Section section, Course course) {
//        for (Course Course : Course.courses) {
//            // check courses that matches the students major, term
//            if (Course.getTerm() == student.getTerm() && Course.getMajor().equalsIgnoreCase(student.getMajor())) {
//                //we could add more conditions in the if statement.
//                String s = "";
//                s += "Course name is " + Course.getName() + ", Course Code is:" + Course.getCode() + ", Hours: " + Course.getHours();
//                System.out.println(s);
//            }
//        }
//    }
    
    

    @Override
    public void Operation() {
        //no need
    }
}
