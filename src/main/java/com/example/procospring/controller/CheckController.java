package com.example.procospring.controller;

import com.example.procospring.service.YourService;
import com.example.procospring.user.YourEntity;
import com.example.procospring.user.SearchCritera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CheckController {

    @Autowired
    private YourService yourService;

    @PostMapping("/search")
    public List<YourEntity> search(@RequestBody SearchCritera criteria) {
        return yourService.search(criteria.getCountry(), criteria.getGrade(), criteria.getLanguage(), criteria.getLanguage2(), criteria.getDormitory());
    }
}

//Test