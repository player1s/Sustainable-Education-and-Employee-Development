package SEED.Data;

import SEED.Model.Case;
import SEED.Model.Company;

import java.util.Arrays;
import java.util.List;

public class CaseRepository {
    CompanyRepository companyRepository = new CompanyRepository();
    private List<Case> ALL_CASES = Arrays.asList(
            new Case(1, "case1",companyRepository.findById(1)),
            new Case( 2,"case2",companyRepository.findById(1)),
            new Case( 3,"case2",companyRepository.findById(1))
    );

    public List<Case> getALL_COMPANIES(){
        return ALL_CASES;
    }

    public Case findById(int id)
    {
        for(Case Case : ALL_CASES) {
            if(id == Case.getId())
                return Case;
        }
        return null;
    }
}
