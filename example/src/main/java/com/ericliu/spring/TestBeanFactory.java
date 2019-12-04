package com.ericliu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
public class TestBeanFactory {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext("com.ericliu.spring.**");
		TestObj obj=applicationContext.getBean(TestObj.class);
		obj.hello();
	}
}
