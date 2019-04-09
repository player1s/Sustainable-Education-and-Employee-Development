package SEED;

import java.util.ArrayList;

import SEED.Data.CaseRepository;
import SEED.Model.Case;

public class test_case_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CaseRepository caserep = new CaseRepository();
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("sec");
		al.add("third");
		
		al.remove(null);
	System.out.println("finish1");
	
	
	Case c = null;

	 try {
 	   c.setId(22);
 	   
	 }
	 catch(NullPointerException e) {
		 System.out.print("Caught NullPointerException"); 
	 }
	
	}
	

}
