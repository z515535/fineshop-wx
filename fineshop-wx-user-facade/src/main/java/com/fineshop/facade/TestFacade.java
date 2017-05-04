package com.fineshop.facade;

import com.fineshop.entity.Pages;
import com.fineshop.entity.TestEntity;

import java.util.List;

/**
 * Created by acer on 2017-4-30.
 */
public interface TestFacade {

    List<TestEntity> search(Pages pages, TestEntity testEntity);
}
