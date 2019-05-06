package SEED.Logic;

import SEED.Data.CaseRepository;
import SEED.Data.StudentRepository;
import SEED.Model.Case;
import SEED.Model.Company;
import SEED.Model.University;

import java.util.List;

public class EventHandler {

    // take student name that is applying and to witch case name
    //update case with the info
    //the connection between the input and the logic is through thymeleaf
    public void applyToCase(int caseID, int studentId)
    {
        CaseRepository caseRepo = new CaseRepository();
        StudentRepository studentRepository = new StudentRepository();

        caseRepo.studentApplies(studentRepository.findById(studentId),caseID);
    }

    //taking all the necessary info for setting up a new case.
    //take it to the case repository, make a new entry with the given data
    //the connection between the input and the logic is through thymeleaf
    public void createCase(String caseName, University university, Company company)
    {
        CaseRepository caseRepo = new CaseRepository();


    }
   /*
    public List<Case> listCases(University university)
    {

    }

    */
}
