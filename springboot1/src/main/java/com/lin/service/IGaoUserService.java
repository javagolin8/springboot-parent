package com.lin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.pojo.GaoUser;

import java.util.List;

public interface IGaoUserService extends IService<GaoUser> {

    List<GaoUser>findAll();


    GaoUser fingyonghu(Long id);


}
