package SEED.Data;

import SEED.Model.Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyRepository

{

	private Company comp = new Company();
	private CompanyRepository compRe = new CompanyRepository();

	private List<Company> ALL_COMPANIES = Arrays.asList(new Company(1, "Company1"), new Company(2, "Company2"),
			new Company(3, "Company3"));

	public List<Company> getAllElements() {
		return ALL_COMPANIES;
	}

	public Company findById(int id) {
		for (Company Company : ALL_COMPANIES) {
			if (id == Company.getId())
				return Company;
		}
		return null;
	}

// Add a compay to the list
	public Company addCompany(Company comp) {
		ALL_COMPANIES.add(comp);

	}

	// Remove a company from the list.
	public Company removeCompany(int id) {

		for (Company Company : ALL_COMPANIES) {
			if (id == Company.getId())
				return Company;
		}
		return ALL_COMPANIES.remove(comp);

	}

	// Update a company
	public Company updateCompany(int id) {
		for (Company Company : ALL_COMPANIES) {
			if (id == Company.getId())
				return company;

		}

		return null;
	}

	public void updateCompanyById(int id, String compName, ArrayList<Company> ALL_COMPANIES) {
		Company c = getById(id);
		try {
			c.setId(id);
			c.setName(compName);
			c.setCompanyList(universityList);
		} catch (NullPointerException e) {
			System.out.print("Caught NullPointerException");
		}

	}

}