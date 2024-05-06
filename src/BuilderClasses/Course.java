package BuilderClasses;

import proxyClasses.*;

import java.util.ArrayList;

public class Course implements courseBuilder {
    public ArrayList<Section> sections = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();

    //this data field will be used to store all the courses that will be created using a course builder.
    int Term;
    String Name;
    String Code;
    String Major;
    int hours;

    public Course(int term, String name, String code, String major, int hours) {
        Term = term;
        Name = name;
        Code = code;
        Major = major;
        this.hours = hours;
    }
    public void addSection(Section section) {
        sections.add(section);
    }
    public int getTerm() {
        return Term;
    }

    public void getSections() {
        for(Section section : sections){
            System.out.println("Section: "+ section.getName());
        }
    }

    @Override
    public void buildCourse() {
        courses.add(this);
    }

    @Override
    public Course getCourse() {
        return this;
    }

    public void setTerm(int term) {
        Term = term;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public String getMajor() {
        return Major;
    }

    public int getHours() {
        return hours;
    }
    
    public static Course findCourse(String Code){

        for (Course course: Course.courses){
            if (course.getCode().equalsIgnoreCase(Code)){
                //if we enter here , we found the course object with the same code
                return course;
            }
        }
        return null;
    }
}
