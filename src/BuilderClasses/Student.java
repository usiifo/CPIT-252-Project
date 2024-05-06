package BuilderClasses;


import proxyClasses.Section;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student implements studentBuilder {
    public static ArrayList<Student> Students = new ArrayList<>();
    //this data field will be used to store all the students that will be created using a student builder.
    String Name;
    int ID;
    String password;
    String Email;
    String Major;
    int Term;
    ArrayList<Course> RegisteredCourses;

    public Student(String name, int ID,String password, String email, String major, int term){
        this.Name=name;
        this.ID=ID;
        this.password = password;
        this.Email= email;
        this.Major=major;
        this.Term=term;
        this.RegisteredCourses = new ArrayList<>();
    }

    public void deleteCourse(Course course) {
        RegisteredCourses.remove(course);
        System.out.println("Delete successful for " + course.getName());
    }
    public void registerCourse(Course course, Section section) {
        if (section.addStudent(this)) {  // Assuming addStudent method returns boolean
            RegisteredCourses.add(course);
            System.out.println("Registration successful for " + course.getName());
        } else {
            System.out.println("Registration failed - Section is full");
        }
    }

    public List<Course> getRegisteredCourses() {
        return RegisteredCourses;
    }

    public void setTerm(int term) {
        Term = term;
    }

    public Student(String Name, int ID, String Email, String Major) {
        this.Name = Name;
        this.ID = ID;
        this.Email = Email;
        this.Major = Major;
    }

    @Override
    public void buildStudent() {
        Students.add(new Student(this.Name, this.ID,this.password, this.Email, this.Major, this.Term));
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTerm() {
        return Term;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }
    @Override
    public Student getStudent() {
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

