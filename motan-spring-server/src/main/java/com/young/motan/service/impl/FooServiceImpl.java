package com.young.motan.service.impl;

import com.young.motan.ParamRequest;
import com.young.motan.service.FooService;

/**
 * @author young
 * @version 1.0
 * @date 2021/4/1 9:18 上午
 * @description
 */
public class FooServiceImpl implements FooService {

    @Override
    public String hello(String name) {
        return name;
    }

    @Override
    public String hi(ParamRequest request) {
        return request.getName();
    }
}
