package com.ericliu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
@Component
public class TestObjImpl implements TestObj , InitializingBean {

	private String name="";

	public TestObjImpl() {
		System.out.println("构造方法");
	}

	@PostConstruct
	public void init(){
		System.out.println("postConstruct");
	}

	public String getName() {
		return name;
	}

	public TestObjImpl setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	@Override
	public void hello() {
		System.out.println("hello!! i am "+name);
	}
}
