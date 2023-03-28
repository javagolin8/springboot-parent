package com.lin.controller;

import com.lin.mapper.GaoUserMapper;
import com.lin.pojo.GaoUser;
import com.lin.service.IGaoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GaoUserController {

    @Resource
    private GaoUserMapper gaoUserMapper;
    @Autowired
    private IGaoUserService iGaoUserService;
    @GetMapping("gao")
    public void test(){

    }
    /**
     * 查询全部
     */
    @GetMapping("gao1")
    public List<GaoUser> test1(){

        List<GaoUser> gaoUsers = gaoUserMapper.selectList(null);
         return gaoUsers;
    }

    @GetMapping("gao6")
    public List<GaoUser> test5(){

        List<GaoUser> allmapper = gaoUserMapper.findAllmapper();
        return allmapper;
    }
    @GetMapping("gao2")
    public List<GaoUser> test2(){
        List<GaoUser> list = iGaoUserService.list();
        return  list;
    }
    @GetMapping("gao4")
    public List<GaoUser> test4(){
        List<GaoUser> list = iGaoUserService.findAll();
        return  list;
    }
/**
 * 根据id查找用户
 */
    @GetMapping("gao1/{id}")
    public GaoUser test1(@PathVariable("id")Long id){

        GaoUser fingyonghu = iGaoUserService.fingyonghu(id);
//        GaoUser byId = iGaoUserService.getById(id)

        return fingyonghu;


    }

    @GetMapping("gao3")
    public void test3(){

        GaoUser gaoUser = new GaoUser();
        gaoUser.setAge(22);
        gaoUser.setName("林樟");
        gaoUserMapper.insert(gaoUser);

    }



}
