package com.young.motan;

import java.io.Serializable;

/**
 * @author young
 * @version 1.0
 * @date 2022/9/6 15:34
 * @description
 */
public class ParamRequest implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
