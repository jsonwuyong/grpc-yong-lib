package com.linshen.grbcclient;
/**
 * Created by sunny
 * 2019/2/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author
 * @create 2019-02-18 16:54
 **/
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "Sunny") String name) {
        return grpcClientService.sendMessage(name);
    }
}
