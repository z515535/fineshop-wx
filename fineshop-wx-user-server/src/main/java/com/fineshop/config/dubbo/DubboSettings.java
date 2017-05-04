package com.fineshop.config.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by acer on 2017-4-30.
 */
@Configuration
@ImportResource(locations = {"classpath:config/dubbo/dubbo-provider.xml"})
public class DubboSettings {}
