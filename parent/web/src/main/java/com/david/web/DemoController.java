package com.david.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.david.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * =================================
 * Created by David on 2018/12/21.
 * mail:    17610897521@163.com
 * 描述:
 */

@RestController
public class DemoController {

    @Reference
    DemoService demoService;

    /**
     * http://localhost:8081/sayHello?name=David
     *
     * @param name
     * @return
     */
    @RequestMapping("sayHello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
