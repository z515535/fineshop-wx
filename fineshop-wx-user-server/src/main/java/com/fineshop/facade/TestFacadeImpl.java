package com.fineshop.facade;

import com.fineshop.entity.Pages;
import com.fineshop.entity.TestEntity;
import com.fineshop.service.TestServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by acer on 2017-4-30.
 */
@Service("testFacade")
public class TestFacadeImpl implements TestFacade {

    @Resource
    private TestServer testServer;

    @Override
    public List<TestEntity> search(Pages pages, TestEntity testEntity) {
        return testServer.searchTest2List(pages, testEntity);
    }
}
