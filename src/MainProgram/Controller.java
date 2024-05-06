package MainProgram;


import BuilderClasses.*;
import proxyClasses.*;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 96657
 */
public class Controller {
    Student LoggedStudent;
    public void Start(){
        //this method represent the connection with the model, and everything else.
        
        //if we enter here , this means that a client connected and we must start serving him
        //before we must know who he is , an admin or a student.
        
        Scanner input = new Scanner(System.in);
        LoggedStudent = null;
        
        while(true){
            //this loop is here to keep requesting infor from the user until he enters correct info , then we break;
            System.out.println("Enter id ");
            int id = input.nextInt();

            System.out.println("Enter Password");
            String password = input.next();
            
            //now we need to check his id and password and to know who he is.
            LoggedStudent = authentication.AuthinticateStudent(id, password);
            
            //after the authintication we will get the Student object who logged in.
            //but if its null, this means that the student doesn't exist.
            //and so don't break from the loop
            
            if (LoggedStudent != null){
                //if the student object actually exist , then break from the loop
                break; 
            }
                
        }
        
        //when ever we reach this line , this means that the student has authinticated correctly , and we know 
        //which student object he is.
        
        //now we must start the  View loop of the student.
        
        StudentView view = new StudentView();
        view.view(LoggedStudent,this);
        //call the view method which will handle what the user sees (main menu) 
        
    }
    
    public void BrowseCourses(){
        // in this method , the controller has to communicate with the model
        //in order to show the student all the courses in the same major.
        
        //this requires us to create a service proxy , and a real service and whatnot 
        
        //do some logging such as recording something , before calling the true service.
        
        Service proxy = new serviceProxy(LoggedStudent,new BrowseCourses());
        proxy.Operation();
        
        
    }
    
    public void registerCourse(String CourseCode,String SectionName){
        //here we will register the student to a certain course
        //given its Codename, and the section within the course.
        Course course = Course.findCourse(CourseCode);
        Section section = null;
        if (course != null) {
            section = Section.findSection(course, SectionName);
        }
        Service proxy = new serviceProxy(LoggedStudent, section, course, new RegisterCourse());
        proxy.Operation();
        
        
    }
    
    public void ViewRegisteredCourses(){
        
        Service proxy = new serviceProxy(LoggedStudent,new ViewRegisteredCourses());
        proxy.Operation();
        
    }
    
    public void deleteRegisteredCourse(String CourseCode){
            Course course = Course.findCourse(CourseCode);
            Service proxy = new serviceProxy(LoggedStudent, course, new DeleteCourse());
            proxy.Operation();

        
        
    }
}
