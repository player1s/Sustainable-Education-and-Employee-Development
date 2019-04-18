package SEED.Data;

import SEED.Model.Case;
import SEED.Model.Company;
import SEED.Model.Student;
import SEED.Model.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaseRepository {

	
    private List<Case> ALL_CASES;

    CompanyRepository companyList = new CompanyRepository();

    //constructor
    public CaseRepository()
    {
    	ALL_CASES = new ArrayList <Case>();

        // filler data
        ALL_CASES.add(new Case(1, "Website", companyList.findById(1)));
        ALL_CASES.add(new Case(2, "Design", companyList.findById(2)));
        ALL_CASES.add(new Case(3, "Market", companyList.findById(1)));
    }
   
    //getters   
    public List<Case> getAllElements(){
        return ALL_CASES;
    }

    public Case getById(int id)
    {
        for(Case Case : ALL_CASES) {
            if(id == Case.getId())
                return Case;
        }
        return null;
    }


     public void removeById(int id)
     {
    	 ALL_CASES.remove(getById(id)); //gets case by id and removes it
    	 								//in terms of receiving 'null' won't do anything
     }


     //later planing to implement same method with less parameters (e.g. only update name )
     public void updateElementById(int id, String caseName, Company company ,ArrayList<Student> studentlist, ArrayList<University> universityList )
     {
    	 Case c = getById(id);
    	 try {
     	   c.setId(id);
     	   c.setName(caseName);
     	   c.setCompany(company);
     	   c.setStudentList(studentlist);
     	   c.setUniversityList(universityList);
    	 }
    	 catch(NullPointerException e) {
    		 System.out.print("Caught NullPointerException"); 
    	 }
    	
     }

     public void studentApplies(Student student, int caseId)
     {
         getById(caseId).getStudentList().add(student);
     }

     
}
