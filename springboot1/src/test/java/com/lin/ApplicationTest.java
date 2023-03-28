package com.lin;


import com.lin.mapper.GaoUserMapper;
import com.lin.pojo.GaoUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringBootApplication1.class)
@Slf4j
public class ApplicationTest {

    @Resource
    private GaoUserMapper gaoUserMapper;
    @Test

    public void tesr1(){
        System.out.println(1);
}

    @Test
    public void test3(){

        GaoUser gaoUser = new GaoUser();
        gaoUser.setAge(222);
        gaoUser.setName("林樟");
        gaoUserMapper.insert(gaoUser);

    }}
