package com.tcs.poc.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tcs.poc.service",
	"com.tcs.poc.controller",
	"com.tcs.poc.hibernate",
	"com.tcs.poc.pojo"})
public class DiaryManagerMSApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(DiaryManagerMSApplication.class);
	}
}
