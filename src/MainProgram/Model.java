/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProgram;
import BuilderClasses.*;
import proxyClasses.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 96657
 */
public class Model {
    Student LoggedStudent;
    private List<Observer> observers = new ArrayList<>();
    private void notifyObservers(String u) {
        for (Observer observer : observers) {
            observer.update(u);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public Model(Student LoggedStudent) {
        this.LoggedStudent = LoggedStudent;
    }
    
    public String BrowseCourses(){
        // in this method , the model must return the list of courses available

        Service proxy = new serviceProxy(LoggedStudent,new BrowseCourses());
        String Result = proxy.Operation();
        notifyObservers("BROWSE");
        return Result;
    }
    
    public String registerCourse(String CourseCode,String SectionName){
        Course course = Course.findCourse(CourseCode);
        Section section = null;
        if (course != null) {
            section = Section.findSection(course, SectionName);
        }
        Service proxy = new serviceProxy(LoggedStudent, section, course, new RegisterCourse());
        notifyObservers("REGISTER");
        return proxy.Operation();
        
        
    }
    
    
    public String ViewRegisteredCourses(){
        Service proxy = new serviceProxy(LoggedStudent,new ViewRegisteredCourses());
        notifyObservers("VIEW");
        return proxy.Operation();
    }
    
    public String deleteRegisteredCourse(String CourseCode){
        Course course = Course.findCourse(CourseCode);
        Service proxy = new serviceProxy(LoggedStudent, course, new DeleteCourse());
        notifyObservers("DELETE");
        return proxy.Operation();

    }
}
