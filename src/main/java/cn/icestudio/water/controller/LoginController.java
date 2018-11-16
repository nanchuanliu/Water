package cn.icestudio.water.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-11-17
 */
@RestController
public class LoginController {
    @RequestMapping
    public String index(String username,String password){
        if("13917206196".equals(username) && "2018".equals(password)){
            return "1";
        }else{
            return "0";
        }
    }
}
