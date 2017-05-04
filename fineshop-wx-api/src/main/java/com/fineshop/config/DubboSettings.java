package com.fineshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by acer on 2017-5-1.
 */
@Configuration
@ImportResource(locations = {"classpath:config/dubbo/dubbo-consume.xml"})
public class DubboSettings {}
