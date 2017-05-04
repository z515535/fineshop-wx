package com.fineshop.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  wugf
 * @version 2017年4月25日22:06:49
 * 类说明 ： 接口异常处理切面
 */
@ControllerAdvice
public class ControllerHandle {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> runTime(Exception e){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("异常了", e.getMessage());
        return map;
    }
}
