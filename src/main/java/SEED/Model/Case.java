package SEED.Model;

public class Case {
	private String caseName;
    private University uni;
    private Company comName;

   
    public String getCaseName() {
        return name;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void setUniversity(University uni)
    {
    	this.uni = uni;
    }
    
    public void getUniversity()
    {
    	return uni;
    }

    public Case(String name, Company company, University uni) {
        this.name = name;
        this.company = company;
        this.uni = uni;
    }
}
