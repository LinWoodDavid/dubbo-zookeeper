package com.david.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.david.service.DemoService;

/**
 * =================================
 * Created by David on 2018/12/21.
 * mail:    17610897521@163.com
 * 描述:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello! " + name;
    }
}
