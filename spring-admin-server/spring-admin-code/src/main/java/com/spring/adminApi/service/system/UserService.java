package com.spring.adminApi.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.dao.system.UserRepository;
import com.spring.adminApi.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Service
public class UserService extends ServiceImpl<UserRepository, User> implements IService<User> {
    public int add(User user) {
        int insert = baseMapper.insert(user);
        return insert;
    }


//    public int add(User params) {
//        return baseMapper.insert(params);
//    }
}
