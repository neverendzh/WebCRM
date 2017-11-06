package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/11/6.
 */
@Controller
public class LoginCrotroller {
    //@RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})//method = RequestMethod.GET )
    // @GetMapping//spring4之后可以使用这样方式注释
    @GetMapping("/log")
    public String sayHello(){

        System.out.println("hello---springMVC");

        return "login";
    }
}
