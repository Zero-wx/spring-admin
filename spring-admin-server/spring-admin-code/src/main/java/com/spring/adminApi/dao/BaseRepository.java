package com.spring.adminApi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Mapper
public interface BaseRepository<T> extends BaseMapper<T> {
}
