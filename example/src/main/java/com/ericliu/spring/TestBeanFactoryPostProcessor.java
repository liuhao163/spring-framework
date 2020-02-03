package com.ericliu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/13
 * Description:
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	//容器Load所有bean之后执行postProcessBeanFactory，方法中获取beanFactory对象。可以对beanFactory做一些操作，或者已经注册的BeanDefinition做一些属性的修改等
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor-->postProcessBeanFactory 方法");
//		String[] beanNames=beanFactory.getBeanDefinitionNames();
//		for(String beanName:beanNames){
//			if(beanName.equals("testObjImpl")){
//				BeanDefinition beanDefinition=beanFactory.getBeanDefinition(beanName);
//				System.out.println("修改name值");
//				beanDefinition.getPropertyValues().add("name", "liuhao-postProcessor");
//			}else if (beanName.equals("testObjImplWithOutAnnoation")){
//				BeanDefinition beanDefinition=beanFactory.getBeanDefinition(beanName);
//				System.out.println("修改name值withOutAnnoation");
//				beanDefinition.getPropertyValues().add("name", "liuhao-without annoation -postProcessor");
//			}
//		}
//		System.out.println("======TestBeanFactoryPostProcessor over=======");
	}
}
