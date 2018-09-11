package com.sp.demo_sb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author: Seven
 * Email : cpwu@foxmail.com
 * 2018-07-20 星期五 22:44
 */
@RestController
public class Hello {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot!";
    }
}
