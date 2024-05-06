package proxyClasses;

import BuilderClasses.*;
import stateClasses.*;

import java.util.ArrayList;

public class Section {

    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Section> sections = new ArrayList<>();

    //this data field will be used to store all the Sections Created.
    String Name;
    int Seats;
    Course Course;
    SectionState State;

    public Section(String Name, int Seats, Course course, SectionState State) {
        this.Name = Name;
        this.Seats = Seats;
        this.Course = course;
        this.State = State;
        sections.add(this);
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public boolean addStudent(Student student) {
        if (students.size() < Seats) {
            students.add(student);
            checkStatus();  // Update state based on new student count
            return true;
        } else {
            System.out.println("Section is full, cannot add more students.");
            return false;
        }
    }

    public void checkStatus() {
        if (students.size() >= Seats) {
            setState(new FullState());  // Assuming FullState is a class implementing SectionState
        } else {
            setState(new notFullState());  // Assuming NotFullState is another SectionState implementation
        }
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public Course getCourse() {
        return Course;
    }

    public void setCourse(Course Course) {
        this.Course = Course;
    }

    public SectionState getState() {
        return State;
    }

    public void setState(SectionState State) {
        this.State = State;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public static Section findSection(Course course,String SectionName){
        
        for (Section section: course.sections){
            if (section.Name.equalsIgnoreCase(SectionName)){
                return section;
            }
        }
        return null;
    }

}


