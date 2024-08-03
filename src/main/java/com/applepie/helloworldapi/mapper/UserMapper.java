package com.applepie.helloworldapi.mapper;

import com.applepie.helloworldapi.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author maggie
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-08-03 11:26:01
* @Entity com.applepie.helloworldapi.dao.User
*/
public interface UserMapper extends BaseMapper<User> {
    User getUserByName(@Param("name") String name, @Param("password") String password);
}




