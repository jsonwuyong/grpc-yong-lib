package com.linshen.grbcclient;/**
 * Created by sunny
 * 2019/3/9.
 */

import com.alibaba.fastjson.JSONObject;
import com.linshen.annotation.UserLoginToken;
import com.linshen.mode.User;
import com.linshen.service.TokenService;
import com.linshen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author
 * @create 2019-03-09 18:02
 **/
@RestController
@RequestMapping("api")
public class UserLoginController {

    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;


    //登录
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody User user){
        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.findByUsername(user);
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){

        return "你已通过验证";
    }
}
