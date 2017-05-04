package com.fineshop.controller;

import com.fineshop.entity.Pages;
import com.fineshop.entity.TestEntity;
import com.fineshop.facade.TestFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2017-4-30.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestFacade testFacade;

    @RequestMapping("/rest")
    public Map<String, Object> rest(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("re", "ok");
        //return map;
        throw new RuntimeException("参数异常");
    }

    @RequestMapping("/dubbo")
    public List<TestEntity> dubbo(Pages pages){
        return testFacade.search(pages, new TestEntity());
    }
}
