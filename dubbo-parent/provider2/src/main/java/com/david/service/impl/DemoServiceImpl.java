package com.david.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.david.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
