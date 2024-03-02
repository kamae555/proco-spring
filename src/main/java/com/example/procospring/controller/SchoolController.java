package com.example.procospring.controller;
// 이 페이지의 목표는 checkbox로 받아온 것들을 가져와서 select 문을 만들어주는 것이 목표

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.procospring.service.SchoolService;
import com.example.procospring.repository.FilterRequest;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/countries")
    public ResponseEntity<List<String>> getCountries() {
        List<String> countries = schoolService.getCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping("/toefl")
    public ResponseEntity<List<String>> getToefl() {
        List<String> toefl = schoolService.getToefl();
        return new ResponseEntity<>(toefl, HttpStatus.OK);
    }

    @GetMapping("/languages")
    public ResponseEntity<List<String>> getLanguages() {
        List<String> languages = schoolService.getLanguages();
        return new ResponseEntity<>(languages, HttpStatus.OK);
    }

    @GetMapping("/semesters")
    public ResponseEntity<List<String>> getSemesters() {
        List<String> semesters = schoolService.getSemesters();
        return new ResponseEntity<>(semesters, HttpStatus.OK);
    }

    @GetMapping("/housingOptions")
    public ResponseEntity<List<String>> getHousingOptions() {
        List<String> housingOptions = schoolService.getHousingOptions();
        return new ResponseEntity<>(housingOptions, HttpStatus.OK);
    }

    @PostMapping("/schools/filter")
    public ResponseEntity<?> filterSchools(@RequestBody FilterRequest filterRequest) {
        // Handle filtering logic based on filterRequest
        // Assuming FilterRequest is a class representing your request body
        return new ResponseEntity<>(HttpStatus.OK);
    }
}