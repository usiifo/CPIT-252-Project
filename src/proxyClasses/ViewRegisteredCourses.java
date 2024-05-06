/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyClasses;

import BuilderClasses.Course;
import BuilderClasses.Student;

import java.util.ArrayList;

/**
 *
 * @author 96657
 */
public class ViewRegisteredCourses implements Service{

    @Override
    public void Operation() {
        
    }

    @Override
    public void Operation(Student student, Section section, Course course) {
        ArrayList<Course> registeredCourses = (ArrayList<Course>) student.getRegisteredCourses();
        for (Course rs : registeredCourses) {
            System.out.println(rs.getName());
        }
    }
    
}
