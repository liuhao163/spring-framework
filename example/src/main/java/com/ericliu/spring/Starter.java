package com.ericliu.spring;

import com.ericliu.spring.scaner.LiuHaoMyAnnotionTest;
import com.ericliu.spring.scaner.MyScanProvider;
import com.ericliu.spring.scaner.MyTypeFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Arrays;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */

public class Starter {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext("com.ericliu.spring.**");
//		System.out.println(applicationContext.getBeanDefinitionCount());
//		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
//		System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(TestObj.class)));

		//configer中有Scan的信息和自定义的扫描规则
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Configure.class);
		TestObj obj=applicationContext.getBean(TestObj.class);
		obj.hello();
		//自定义的TypeFilter。LiuHaoMyAnnotionTest有自己定义的注解LiuhaoCunstom
//		LiuHaoMyAnnotionTest liuhao=applicationContext.getBean(LiuHaoMyAnnotionTest.class);
//		liuhao.say();
	}
}
