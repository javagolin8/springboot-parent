package com.lin.controller;

import com.lin.vlue.Student1;
import com.lin.vlue.Student2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Slf4j
public class ValueController {

    @Autowired
    private Student1 student1;



    @Value("${name}")
    private String name1;
    @GetMapping("/test")
    public String test1(){
        System.out.println(name1);
        return name1;

    }
    @Value("${data}")
    private String name2;
    @GetMapping("/test1")
    public String test11(){
        System.out.println(name2);
        return name2;

    }

    @Value("${student.name}")
    private String age;
    @Value("${student:age}")
    private String name;
    @GetMapping("/test2")
    public String test2(){
        System.out.println(name);
        return age;

    }

    @GetMapping("/test4")
    public Student1 test4(){

       return student1;

    }

}
