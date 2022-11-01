package com.spring.adminApi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.adminApi.dao.BaseRepository;


/**
 * Created on 2022/10/31
 *
 * @author huangwx
 * Description:
 */
public abstract class BaseService<T> extends ServiceImpl<BaseRepository<T>, T> implements CrudService<T> {
}



