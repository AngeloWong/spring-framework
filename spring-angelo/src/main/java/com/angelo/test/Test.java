package com.angelo.test;

import com.angelo.config.AppConfig;
import com.angelo.service.BeanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 准备spring所有的前提环境
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(annotationConfigApplicationContext.getBean(BeanService.class));
	}

}
