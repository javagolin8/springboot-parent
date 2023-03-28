package com.lin.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Slf4j
public class MybatisHandler implements MetaObjectHandler {

//    @Override
//    public void insertFill(MetaObject metaObject) {
//        //todo 这里的createTime是实体类的属性名 不是数据库里面的字段名
//        // todo 起始版本 3.3.0(推荐)
//
//        this.strictInsertFill(metaObject,"createTime", LocalDateTime.class,LocalDateTime.now());
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//        //todo 这里用LocalDateTime 所以在实体类中 时间就用的是LocalDateTime的数据类型
//        this.strictUpdateFill(metaObject, "updataTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
//    }
@Override
public void insertFill(MetaObject metaObject) {
    log.info("start insert fill ....");
//    this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
    // 或者
    this.strictInsertFill(metaObject, "createTime", () -> LocalDateTime.now(), LocalDateTime.class); // 起始版本 3.3.3(推荐)
    // 或者
//    this.fillStrategy(metaObject, "createTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug)
}

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
//        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
        // 或者
        this.strictUpdateFill(metaObject, "updateTime", () -> LocalDateTime.now(), LocalDateTime.class); // 起始版本 3.3.3(推荐)
        // 或者
//        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug)
    }
}