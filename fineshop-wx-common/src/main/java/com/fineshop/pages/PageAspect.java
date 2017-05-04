package com.fineshop.pages;

import com.fineshop.entity.Pages;
import com.github.pagehelper.PageHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 分页切面
 */
@Component
@Aspect
public class PageAspect {

    @Pointcut("@annotation(com.fineshop.pages.Paging)")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        //获取参数被注解方法参数
        Object[] params = joinPoint.getArgs();
        Pages pages = this.getPages(params);

        //设置分页参数
        PageHelper.startPage(pages.getPageNum(), pages.getPageSize(), pages.getIsCount());
    }

    /**
     * 获取Pages 参数
     * @param params
     * @return
     */
    private Pages getPages(Object[] params){
        Pages pages = null;
        if (null != params) {
            for (Object param : params) {
                if (param instanceof Pages) {
                    pages = (Pages) param;
                }
            }
        }

        if (null == pages) {
            throw new RuntimeException("缺失 Pages 参数!");
        }

        return pages;
    }
}
