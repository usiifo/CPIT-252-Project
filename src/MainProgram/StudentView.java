package MainProgram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 96657
 */

import BuilderClasses.*;
import java.util.Scanner;


public class StudentView {

    public StudentView() {
    }
    
    public void view(Student LoggedStudent,Controller controller){
        //here will be the things that the student can see , HIS VIEW
        
        //and so the main menu should be here.
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome "+ LoggedStudent.getName() + "to our System");
        System.out.println("=================================================");
        while (true){
            System.out.println("Choose the service you want");
            System.out.println("1- Browse Courses");
            System.out.println("2- Browse Sections in a course");
            System.out.println("3- Register a Course");
            System.out.println("4- See Registered Courses");
            System.out.println("5-Delete A Registered Course");
            System.out.println("Please enter the number of the service.");
            int choice = input.nextInt();
            
            switch (choice){
                case 1:
                    //if we enter here , this means the student want to see the available courses.
                    controller.BrowseCourses();
                    break;
                case 2:
                    
                case 3:
                    //if we enter here , then the student want to register a course in a certain section.
                    System.out.println("please enter the course Code");
                    String register = input.next();
                    
                    System.out.println("please enter the Section name");
                    String Section = input.next();
                    
                    controller.registerCourse(register, Section);
                    break;
                case 4:
                    controller.ViewRegisteredCourses();
                    break;
                case 5:
                    System.out.println("please enter the course Code");
                    String DELETE = input.next();
                    controller.deleteRegisteredCourse(DELETE);

                    //here he wants to delete a certain course he registered.
                    
                }
            }
        }
    }
