package com.spring.adminApi.service.system;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.adminApi.bean.entity.system.SysUser;
import com.spring.adminApi.dao.system.UserRepository;
import com.spring.adminApi.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created on 2022/10/31
 *
 * @author huangwx
 * Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserRepository, SysUser> implements userService {
}
