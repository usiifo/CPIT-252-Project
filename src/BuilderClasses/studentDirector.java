package BuilderClasses;

public class studentDirector {
    private final studentBuilder student;
    public studentDirector(studentBuilder student) {
        this.student = student;
    }
    public void createStudent() {
        student.buildStudent();
    }
    public Student getStudent() {
        return this.student.getStudent();
    }
}
