package com.fineshop.dao;


import com.fineshop.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by acer on 2017-4-25.
 */
@Mapper
public interface TestDao {
    int create(TestEntity test);

    List<TestEntity> searchTest2List();
}
