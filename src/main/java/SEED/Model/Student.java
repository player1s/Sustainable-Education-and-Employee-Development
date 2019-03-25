package SEED.Model;

public class Student {
    private String firstName;
    private String secondName;
    private University university;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student(String firstName, String secondName, University university) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.university = university;
    }
}
