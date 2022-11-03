package com.spring.adminApi.bean.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.spring.adminApi.bean.entity.BaseEntity;
import lombok.Data;

/**
 * Created on 2022/11/3
 *
 * @author huangwx
 * Description:
 */
@TableName("t_sys_role")
@Data
public class Role extends BaseEntity {
    private String role;
}
