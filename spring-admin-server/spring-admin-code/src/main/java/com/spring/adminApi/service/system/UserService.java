package com.spring.adminApi.service.system;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.dao.system.UserRepository;
import com.spring.adminApi.service.BaseService;
import com.spring.adminApi.service.CurdService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Service
public class UserService extends ServiceImpl<UserRepository, User> implements BaseService<User> {


}
