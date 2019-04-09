package SEED.Model;

public class Student {
    
    private String firstName;

    private University university;

 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student(String firstName,University university) {
     
        this.firstName = firstName;
      
        this.university = university;
    }
}
