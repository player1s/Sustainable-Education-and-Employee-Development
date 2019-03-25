package SEED.Model;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private University university;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Student(int id, String firstName, String secondName, University university) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.university = university;
    }
}
