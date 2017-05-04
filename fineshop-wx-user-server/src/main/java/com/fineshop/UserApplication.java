package com.fineshop;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.reflection.ArrayUtil;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UserApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {

		// jar 启动取消 spring 的logo
		SpringApplication app = new SpringApplication(UserApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		//这里传递参数是为了使用 profile 和解决单元测试dubbo常驻问题
		if (ArrayUtils.isNotEmpty(args)){
			//启动dubbo服务
			com.alibaba.dubbo.container.Main.main(null);
		} else {

		}
	}
}
