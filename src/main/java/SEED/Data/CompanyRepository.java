package SEED.Data;

import SEED.Model.Company;
import SEED.Model.University;

import java.util.Arrays;
import java.util.List;

public class CompanyRepository {
    private List<Company> ALL_COMPANIES = Arrays.asList(
            new Company(1, "Company1"),
            new Company( 2,"Company2"),
            new Company( 3,"Company3")
    );

    public List<Company> getALL_COMPANIES(){
        return ALL_COMPANIES;
    }

    public Company findById(int id)
    {
        for(Company Company : ALL_COMPANIES) {
            if(id == Company.getId())
                return Company;
        }
        return null;
    }
}
