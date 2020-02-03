package com.ericliu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/15
 * Description:
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof TestObjImpl) {
			System.out.println("BeanPostProcessor-->postProcessBeforeInitialization==="+beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof TestObjImpl) {
			System.out.println("BeanPostProcessor-->postProcessAfterInitialization ==="+beanName);
		}
		return bean;
	}
}
