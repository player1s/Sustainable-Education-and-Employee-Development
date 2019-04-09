package SEED.Data;

import SEED.Model.Case;
import SEED.Model.Company;
import SEED.Model.Student;
import SEED.Model.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityRepository {
	
	private ArrayList<University> ALL_UNIVERSITIES;
	    
	    
	 //constructor
	public UniversityRepository()
    {
		ALL_UNIVERSITIES = new ArrayList <University>();
	}
	   

	public List<University> getAllElements(){
        return ALL_UNIVERSITIES;
    }

	
    public University getById(int id)
    {
        for(University University : ALL_UNIVERSITIES) {
            if(id == University.getId())
                return University;
        }
        return null;
    }


    
    
    public void removeById(int id)
    {
    	ALL_UNIVERSITIES.remove(getById(id)); //gets uni by id and removes it
    }


    //later planing to implement same method with less parameters (e.g. only update name )
    public void updateElementById(int id, String name)
    {
   	 University c = getById(id);
   	
   	 try {
   		 c.setId(id);
   		 c.setName(name);
   	 }
   	 catch(NullPointerException e) {
		 System.out.print("Caught NullPointerException"); 
	 }
   	 
    }



}
