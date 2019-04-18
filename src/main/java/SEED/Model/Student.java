package SEED.Model;

public class Student

{
	private int id;
    private String fname;
    private University university;

    public Student(int id, String fname, University university) {
        this.id = id;
        this.fname = fname;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}
