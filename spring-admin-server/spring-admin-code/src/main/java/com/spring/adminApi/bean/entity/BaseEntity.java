package com.spring.adminApi.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long createBy;
    private Date createTime;
    private Long modifyBy;
    private Date modifyTime;

}
