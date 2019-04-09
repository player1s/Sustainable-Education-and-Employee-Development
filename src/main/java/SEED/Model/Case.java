package SEED.Model;

import java.util.ArrayList;

public class Case {
    private int id;
    private String caseName;
    private Company company;
    private ArrayList<Student> studentList;
    private ArrayList<University> universityList;

    
    public Case(int id, String name, Company company) {
        this.id = id;
        this.caseName = name;
        this.company = company;
        studentList = new ArrayList<Student>();
        universityList = new ArrayList <University>();
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return caseName;
    }

    public void setName(String name) {
        this.caseName = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public  ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    //needed for updating case
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
    public  ArrayList<University> getUniversityList() {
        return universityList;
    }
    
    //needed for updating the case
    public void setUniversityList(ArrayList<University> universityList) {
        this.universityList = universityList;
    }
    
    
}
