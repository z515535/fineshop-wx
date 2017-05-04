package com.fineshop;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {

	// spring boot tomcat启动配置
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootServletInitializer.class);
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ApiApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
