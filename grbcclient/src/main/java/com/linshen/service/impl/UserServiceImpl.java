package com.linshen.service.impl;/**
 * Created by sunny
 * 2019/3/9.
 */

import com.linshen.mapper.UserMapper;
import com.linshen.mode.User;
import com.linshen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author
 * @create 2019-03-09 17:46
 **/
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(User user) {
        return userMapper.findByUsername(user.getUsername());
    }

    @Override
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}
