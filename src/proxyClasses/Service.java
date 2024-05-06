package proxyClasses;

import BuilderClasses.*;

public interface Service {
    public String Operation();
    public String Operation(Student student, Section section, Course course);
    //this method will be implemented by each service accordingly.
}

