package com.fineshop.config.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 引入事务配置
 */
@Configuration
@ImportResource(locations = {"classpath:config/spring/spring-transaction.xml"})
public class TransactionSettings {}
