package com.spring.adminApi.bean.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.spring.adminApi.bean.entity.BaseEntity;
import lombok.Data;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Data
@TableName("t_sys_user")
public class User extends BaseEntity {
    private String userName;
    private String passWord;
}
