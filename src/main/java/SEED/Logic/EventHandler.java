package SEED.Logic;

import SEED.Data.CaseRepository;
import SEED.Model.Company;
import SEED.Model.University;

public class EventHandler {

    // take student name that is applying and to witch case name
    //update case with the info
    //the connection between the input and the logic is through thymeleaf
    public void applyToCase(String caseName, String StudentName)
    {
        CaseRepository caseRepo = new CaseRepository();
        

        /* caserepo.update for every incoming parameter once that is implemented */
    }

    //taking all the necessary info for setting up a new case.
    //take it to the case repository, make a new entry with the given data
    //the connection between the input and the logic is through thymeleaf
    public void createCase(String caseName, University university, Company company)
    {
        CaseRepository caseRepo = new CaseRepository();

        /* caserepo.create for every incoming parameter once that is implemented */
    }
}
