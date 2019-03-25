package SEED.Model;

public class Case {
    private int id;
    private String name;
    private Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Case(int id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }
}
