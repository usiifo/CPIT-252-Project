package MainProgram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import BuilderClasses.*;
import proxyClasses.Section;

import java.util.Scanner;


public class StudentView {


    public StudentView() {
    }


    
    public void view(Student LoggedStudent,Controller controller){
        //here will be the things that the student can see , HIS VIEW
        
        //and so the main menu should be here.
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome "+ LoggedStudent.getName() + " to our System");
        System.out.println("=================================================");
        while (true){
            System.out.println("Choose the service you want");
            System.out.println("1- Browse Courses");
            System.out.println("2- Register a Course");
            System.out.println("3- See Registered Courses");
            System.out.println("4- Delete A Registered Course");
            System.out.println("Please enter the number of the service.");
            int choice = input.nextInt();
            
            switch (choice){
                case 1:
                    //if we enter here , this means the student want to see the available courses.
                    controller.BrowseCourses();
                    break;
                case 2:
                    //if we enter here , then the student want to register a course in a certain section.
                    System.out.println("please enter the course Code");
                    String register = input.next();
                    
                    System.out.println("please enter the Section name");
                    String Section = input.next();

                    controller.registerCourse(register, Section);
                    break;
                case 3:
                    //if we enter here , the students wants to see the registered courses.
                    controller.ViewRegisteredCourses();
                    break;
                    
                case 4:
                    //if we enter here, the student want to delete a registered course.
                    System.out.println("please enter the course Code");
                    String DELETE = input.next();
                    controller.deleteRegisteredCourse(DELETE);
                    //here he wants to delete a certain course he registered.
                }
            }
        }

        public void printBasedonModel(String s) {
        System.out.println(s);
        }

}
