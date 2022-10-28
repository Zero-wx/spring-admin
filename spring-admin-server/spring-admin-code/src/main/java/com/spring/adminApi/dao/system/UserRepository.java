package com.spring.adminApi.dao.system;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User> {
}
