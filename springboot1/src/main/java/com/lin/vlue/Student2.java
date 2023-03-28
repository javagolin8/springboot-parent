package com.lin.vlue;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;



@Data

public class Student2 {

    @Value("@{student1.name}")
    private String nam2;
    @Value("@{student1.age}")

    private String age1;
    @Value("${student1.dian}")
    private String dian;



}
