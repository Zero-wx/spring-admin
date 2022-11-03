package com.spring.adminApi.dao.system;

import com.spring.adminApi.bean.entity.system.Role;
import com.spring.adminApi.dao.BaseRepository;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2022/11/3
 *
 * @author huangwx
 * Description:
 */
@Mapper
public interface RoleRepository extends BaseRepository<Role> {
}
