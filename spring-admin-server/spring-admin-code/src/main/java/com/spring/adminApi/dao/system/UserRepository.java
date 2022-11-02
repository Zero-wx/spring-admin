package com.spring.adminApi.dao.system;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.dao.BaseRepository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@Mapper
public interface UserRepository extends BaseRepository<User, Long> {

}
