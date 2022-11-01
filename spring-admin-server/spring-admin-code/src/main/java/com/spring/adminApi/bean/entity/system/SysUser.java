package com.spring.adminApi.bean.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.spring.adminApi.bean.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("t_sys_user")
public class SysUser extends BaseEntity {
    private String userName;
    private String passWord;
}
