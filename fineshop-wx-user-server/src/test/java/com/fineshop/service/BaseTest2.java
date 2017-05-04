package com.fineshop.service;

import com.fineshop.entity.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by acer on 2017-5-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BaseTest2 {
    @Resource
    private TestServer testServer;

    @Test
    public void test(){
        System.out.println(testServer.searchTest2List(new Pages(), null));
    }
}
