package SEED.Model;

import java.util.Arrays;
import java.util.List;

public class Company {
	private String name;
	private ArrayList<Company> companyList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company(String name,) {

		this.name = name;
	}
	
	public setCompanyList(ArrayList<Company> companyList)
	{
		this.companyList = companyList;
	}
	
	public getCompanyList(ArrayList<Company> companyList)
	{
		return companyList;
	}
}
