package proxyClasses;
import BuilderClasses.*;

public class serviceProxy implements Service {

    Student student;
    Section section;
    Course course;
    Service RealService;

 

    public serviceProxy(Student student, Section section, Course course,Service RealService) {
        this.student = student;
        this.section = section;
        this.course = course;
        this.RealService = RealService;
    }

    public serviceProxy() {
    }
    public serviceProxy(Service RealService){
        this.RealService = RealService;
    }

    public serviceProxy(Student student, Service RealService) {
        this.student = student;
        this.RealService = RealService;
    }

    public serviceProxy(Student student, Course course, Service RealService) {
        this.student = student;
        this.course = course;
        this.RealService = RealService;
    }
    
    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Service getRealService() {
        return RealService;
    }

    public void setRealService(Service RealService) {
        this.RealService = RealService;
    }
    

    @Override
    public String Operation(Student student, Section section, Course course) {
       return RealService.Operation(student, section, course);
       //this method will call the operation that the real service provides. e.g: registering a course
        
    }
    
    public String Operation(){
        return Operation(student, section, course);
        //this is the method we will use to call any operation of any service
        
    }
}

