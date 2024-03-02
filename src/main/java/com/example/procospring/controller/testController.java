package com.example.procospring.controller;
import org.springframework.web.bind.annotation.*;
import com.example.procospring.user.Param;

@RestController
public class testController {
    @PostMapping("/test")
    public Param post(@RequestBody Param param) {
        Param param1 = new Param();
        param1.setName(param.getName());
        return param1;
    }
}
