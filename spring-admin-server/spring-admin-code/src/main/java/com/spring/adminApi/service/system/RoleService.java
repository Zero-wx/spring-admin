package com.spring.adminApi.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.adminApi.bean.entity.system.Role;
import com.spring.adminApi.dao.system.RoleRepository;
import com.spring.adminApi.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Service
public class RoleService extends ServiceImpl<RoleRepository, Role> implements IService<Role> {

    public int add(Role role) {
        int insert = baseMapper.insert(role);
        return insert;
    }
}
