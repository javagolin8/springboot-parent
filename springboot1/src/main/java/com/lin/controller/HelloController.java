package com.lin.controller;

import com.lin.vlue.Student2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/lin")
    public  String nn(){
        return name+name1;

    }
@Value("${app.lin}")
private String name;
    @Value("${app.arrdess}")
private String name1;






}
