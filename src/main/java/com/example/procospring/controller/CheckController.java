package com.example.procospring.controller;

import com.example.procospring.service.YourService;
import com.example.procospring.user.YourEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 이 checkController의 목표는 입력 착에 학교 이름 검색이 목표
@RestController
public class CheckController {

    @Autowired
    private YourService yourService;

    @GetMapping ("/search")
    public List<YourEntity> search(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String grade,
            @RequestParam(required = false) String language,
            @RequestParam(required = false) String period,
            @RequestParam(required = false) Boolean dormitory) {
        return yourService.search(country, grade, language, period, dormitory);
    }
}
