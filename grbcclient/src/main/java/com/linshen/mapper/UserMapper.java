package com.linshen.mapper;

import com.linshen.mode.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by sunny
 * 2019/3/9.
 */
@Mapper
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(@Param("Id") String Id);

}
