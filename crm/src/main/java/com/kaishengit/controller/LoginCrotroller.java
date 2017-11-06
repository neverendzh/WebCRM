package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/6.
 */
@Controller
@RequestMapping
public class LoginCrotroller {
    //@RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})//method = RequestMethod.GET )
    // @GetMapping//spring4之后可以使用这样方式注释
    @GetMapping("/log")
    public String sayHello(){
        return "login";
    }

    @PostMapping
    public String Login(){
        return "employee";
    }

}
