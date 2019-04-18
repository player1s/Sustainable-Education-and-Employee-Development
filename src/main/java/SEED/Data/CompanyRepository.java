package SEED.Data;

import SEED.Model.Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyRepository
{
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
	public void addCompany(Company comp) {
		ALL_COMPANIES.add(comp);
	}

	// Remove a company from the list.
	public void removeCompany(int id) {
		for (Company Company : ALL_COMPANIES) {
			if (id == Company.getId())
				ALL_COMPANIES.remove(id);
		}
	}

	// Update a company
	public void updateCompanyById(int id, String compName) {
		for (Company Company : ALL_COMPANIES) {
			if (id == Company.getId())
				Company.setName(compName);
		}

	}

}