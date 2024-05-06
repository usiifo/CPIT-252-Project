package proxyClasses;

import BuilderClasses.*;

public interface Service {
    public void Operation();
    public void Operation(Student student, Section section, Course course);
    //this method will be implemented by each service accordingly.
}

