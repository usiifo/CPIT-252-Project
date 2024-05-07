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
    Model Model;
    public void Start(){
        //this method represent the connection with the model, and everything else.
        
        //if we enter here , this means that a client connected and we must start serving him
        //before we must know who he is , an admin or a student.
        
        Scanner input = new Scanner(System.in);
        LoggedStudent = null;
        
        while(true){
            //this loop is here to keep requesting infor from the user until he enters correct info , then we break;
            System.out.println("Enter ID: ");
            int id = input.nextInt();

            System.out.println("Enter Password: ");
            String password = input.next();
            
            //now we need to check his id and password and to know who he is.
            LoggedStudent = authentication.AuthinticateStudent(id, password);
            
            //but if its null, this means that the student doesn't exist.
            //and so don't break from the loop
            
            if (LoggedStudent != null){
                //if the student object actually exist , then break from the loop
                break; 
            }
                
        }
        
        //when ever we reach this line , this means that the student has authenticated correctly , and we know
        //which student object he is.
        Model = new Model(LoggedStudent);
        //now we must start the  View loop of the student.
        
        StudentView view = new StudentView();
        view.view(LoggedStudent,this);
        //call the view method which will handle what the user sees (main menu) 
        
    }
    
    public void BrowseCourses(){
        // in this method , the controller has to communicate with the model
        //in order to show the student all the courses in the same major.

        String Result = Model.BrowseCourses();
        System.out.println(Result);
        
    }
    
    public void registerCourse(String CourseCode,String SectionName){
        //here we will register the student to a certain course
        //given its Codename, and the section within the course.
        String Result = Model.registerCourse(CourseCode, SectionName);
       
        System.out.println(Result);
    }
    
    public void ViewRegisteredCourses(){
        
        String Result = Model.ViewRegisteredCourses();
        
        System.out.println(Result);
    }
    
    public void deleteRegisteredCourse(String CourseCode){
        
        String Result = Model.deleteRegisteredCourse(CourseCode);
        System.out.println(Result);
        
    }
}
