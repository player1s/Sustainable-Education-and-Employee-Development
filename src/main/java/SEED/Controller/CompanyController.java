package SEED.Controller;

import SEED.Data.CompanyRepository;
import SEED.Model.Company;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class CompanyController {


    private CompanyRepository companyRepository = new CompanyRepository();

    
    public CompanyController() throws IOException {
    }

    /*
        @RequestMapping("/Company")
        public String listCompanies(ModelMap modelMap) {
            List<Company> allCompanies = companyRepository.getAllElements();
            modelMap.put("Companies", allCompanies);
            return "home";
        }
    */
    @RequestMapping("/Company")
    public String listCompanies(Model model) {
        model.addAttribute("companies", companyRepository.getAllElements());

        return "home";
    }

    @RequestMapping("/Company/CreateCase")
    public String listSpecCompany() {

        return "gif-details";
    }

    @RequestMapping("/Company/CreateCase/aa")
    @ResponseBody
    public String respBody() {

        return "gif-details";
    }


}
