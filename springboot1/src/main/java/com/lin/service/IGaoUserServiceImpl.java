package com.lin.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.mapper.GaoUserMapper;
import com.lin.pojo.GaoUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class IGaoUserServiceImpl extends ServiceImpl<GaoUserMapper, GaoUser>implements IGaoUserService {
  @Autowired
  private IGaoUserService iGaoUserService ;
    @Override
    public List<GaoUser> findAll() {
        List<GaoUser> gaoUsers = this.baseMapper.selectList(null);
        return gaoUsers;
    }

    @Override
    public GaoUser fingyonghu(Long id) {
        GaoUser byId1 = iGaoUserService.getById(id);
     return byId1;
    }
}
