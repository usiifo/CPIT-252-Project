/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProgram;
import BuilderClasses.*;
import proxyClasses.*;
import java.util.Scanner;

/**
 *
 * @author 96657
 */
public class Model {
    Student LoggedStudent;

    public Model() {
    }

    public Model(Student LoggedStudent) {
        this.LoggedStudent = LoggedStudent;
    }
    
    public String BrowseCourses(){
        // in this method , the model must return the list of courses available

        Service proxy = new serviceProxy(LoggedStudent,new BrowseCourses());
        String Result = proxy.Operation();
        
        return Result;
    }
    
    public String registerCourse(String CourseCode,String SectionName){
        Course course = Course.findCourse(CourseCode);
        Section section = null;
        if (course != null) {
            section = Section.findSection(course, SectionName);
        }
        Service proxy = new serviceProxy(LoggedStudent, section, course, new RegisterCourse());
        return proxy.Operation();
        
        
    }
    
    
    public String ViewRegisteredCourses(){
        Service proxy = new serviceProxy(LoggedStudent,new ViewRegisteredCourses());
        return proxy.Operation();
    }
    
    public String deleteRegisteredCourse(String CourseCode){
        Course course = Course.findCourse(CourseCode);
        Service proxy = new serviceProxy(LoggedStudent, course, new DeleteCourse());
        return proxy.Operation();
        
    }
}
