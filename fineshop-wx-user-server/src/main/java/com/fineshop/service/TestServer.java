package com.fineshop.service;

import com.fineshop.entity.Pages;
import com.fineshop.entity.TestEntity;

import java.util.List;

/**
 * Created by acer on 2017-4-25.
 */
public interface TestServer {
    int create(TestEntity test);

    void create();

    List<TestEntity> searchTest2List(Pages pages, TestEntity test);
}
