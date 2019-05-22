package com.david.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.david.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class DemoController {

    //@Reference
    @Reference(url = "dubbo://127.0.0.1:20882")//dubbo直连
    DemoService demoService;

    /**
     * http://localhost:8081/hello?name=David
     * @param name
     * @return
     */
    @RequestMapping("hello")
    public String hello(String name){
        return demoService.sayHello(name);
    }
}
