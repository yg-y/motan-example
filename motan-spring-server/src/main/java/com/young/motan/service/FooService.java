package com.young.motan.service;

import com.young.motan.ParamRequest;

/**
 * @author young
 * @version 1.0
 * @date 2021/4/1 9:17 上午
 * @description
 */
public interface FooService {
    String hello(String name);

    /**
     * 如果 ParamRequest 没有序列化，则会报错
     *
     * @param request
     * @return
     */
    String hi(ParamRequest request);
}
