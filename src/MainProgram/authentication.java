package MainProgram;





import BuilderClasses.*;

public class authentication {
    public static Student AuthinticateStudent(int id, String password){
        //this method will authinticate the student and return its object to the controller.
        
       for (Student CurrentStudent: Student.Students){
           //this loop will go through every student checking their id and password looking for a match
           
           if (id == CurrentStudent.getID() && password.equals(CurrentStudent.getPassword())){
               //if we enter here , this means we have found a student object with same id and password
               
               return CurrentStudent;
           }
           
       }
       //if we reach this line , this means we have gone through every student that exists in the system.
       // and we haven't found a match.
       
       return null;
    }
    
    //here we can add another method to authinticate for admins.
}
