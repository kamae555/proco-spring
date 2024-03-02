package com.example.procospring.service;
// SchoolService.java

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class SchoolService {

    public List<String> getCountries() {
        // Retrieve countries from database or any other source
        return Arrays.asList("USA", "Canada", "UK", "Australia");
    }

    public List<String> getToefl() {
        // Retrieve TOEFL options from database or any other source
        return Arrays.asList("TOEFL iBT", "TOEFL PBT", "TOEFL CBT");
    }

    public List<String> getLanguages() {
        // Retrieve languages from database or any other source
        return Arrays.asList("English", "Spanish", "French", "German");
    }

    public List<String> getSemesters() {
        // Retrieve semesters from database or any other source
        return Arrays.asList("Spring", "Summer", "Fall", "Winter");
    }

    public List<String> getHousingOptions() {
        // Retrieve housing options from database or any other source
        return Arrays.asList("On-campus", "Off-campus", "Homestay");
    }
}
