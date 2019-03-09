package com.linshen.service;/**
 * Created by sunny
 * 2019/3/9.
 */

import com.linshen.mode.User;

/**
 *
 * @author
 * @create 2019-03-09 17:24
 **/

public interface UserService {

    User findByUsername(User user);

    User findUserById(String userId);

}
