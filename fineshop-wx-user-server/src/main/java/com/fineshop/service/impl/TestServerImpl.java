package com.fineshop.service.impl;

import com.fineshop.dao.TestDao;
import com.fineshop.entity.Pages;
import com.fineshop.entity.TestEntity;
import com.fineshop.pages.Paging;
import com.fineshop.service.TestServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by acer on 2017-4-25.
 */
@Service
public class TestServerImpl implements TestServer {

    @Resource
    private TestDao testDao;

    @Override
    public int create(TestEntity test) {
        return testDao.create(test);
    }

    @Override
    public void create() {
        TestEntity test = new TestEntity();
        test.setId(9);
        test.setName("test7");

        TestEntity test2 = new TestEntity();
        test2.setId(10);
        test2.setName("test8");

        this.create(test);
        this.create(test2);
        throw new RuntimeException();
    }


    @Paging
    public List<TestEntity> searchTest2List(Pages pages, TestEntity test){
        return testDao.searchTest2List();
    }
}
