package com.ericliu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
@Component
@Primary
public class TestObjImpl implements TestObj, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

	private String beanName="";
	private ApplicationContext applicationContext;

	@Autowired
	private TestObjImplWithOutAnnoation testObjImplWithOutAnnoation;


	public TestObjImpl() {
		System.out.println("构造方法");
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct方法");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware-->setBeanName 方法");
		this.beanName = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean-->afterPropertiesSet 方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware-->setApplicationContext  方法");
		this.applicationContext=applicationContext;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean-->destroy 方法");
	}

	@Override
	public void hello() {
		System.out.println(beanName+" say hello");
	}
}
