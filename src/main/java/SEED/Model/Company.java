package SEED.Model;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Cases> caseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cases> getCaseList() {
        return caseList;
    }

    public void setCaseList(ArrayList<Cases> caseList) {
        this.caseList = caseList;
    }

    public Company(String name, ArrayList<Cases> caseList) {
        this.name = name;
        this.caseList = caseList;
    }
}
