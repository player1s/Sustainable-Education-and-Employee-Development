package SEED.Data;

import SEED.Model.Category;
import SEED.Model.University;

import java.util.Arrays;
import java.util.List;

public class UniversityRepository {
    private List<University> ALL_UNIVERSITIES = Arrays.asList(
            new University(1, "balaton"),
            new University( 2,"tisza"),
            new University( 3,"bakony")
    );

    public List<University> getAllUniversities(){
        return ALL_UNIVERSITIES;
    }

    public University findById(int id)
    {
        for(University University : ALL_UNIVERSITIES) {
            if(id == University.getId())
                return University;
        }
        return null;
    }
}
