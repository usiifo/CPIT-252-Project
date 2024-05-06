package BuilderClasses;

public class courseDirector {
    private final courseBuilder course;

    public courseDirector(courseBuilder builder) {
        this.course = builder;
    }

    public void makeCourse() {
        this.course.buildCourse();
    }
    public Course getCourse() {
        return this.course.getCourse();
    }
}