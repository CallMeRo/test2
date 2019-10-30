package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello/feignTest")
    @ResponseBody
    public String index() {
        System.out.println("client invoke");

        //return "云谝启动成功";
        return "场景交流社区启动成功";
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Greetings from Spring test v4!";
    }

}
