package com.fineshop.entity;

import java.io.Serializable;

/**
 * Created by acer on 2017-4-29.
 */

public class TestEntity implements Serializable{

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
