package com.lin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.pojo.GaoUser;

import java.util.List;

/**
 * @author 林樟
 */
public interface GaoUserMapper extends BaseMapper<GaoUser> {

    List<GaoUser> findAllmapper();
}
