package com.spring.adminApi.utils;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyBatisPublicFields implements MetaObjectHandler {
    /**
     * 插入数据自动填充字段
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasSetter("createTime")) {
            metaObject.setValue("createTime", new Date());
        }
        if (metaObject.hasSetter("createBy")) {
            metaObject.setValue("createBy", 1L);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
