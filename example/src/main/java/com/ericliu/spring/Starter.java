package com.ericliu.spring;

import com.ericliu.spring.listener.CoustomEvent;
import com.ericliu.spring.scaner.LiuHaoMyAnnotionTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */

public class Starter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext("com.ericliu.spring.**");
//		System.out.println(applicationContext.getBeanDefinitionCount());
//		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
//		System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(TestObj.class)));

		//configer中有Scan的信息和自定义的扫描规则
//		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Configure.class);
		TestObj obj=applicationContext.getBean(TestObj.class);
		obj.hello();
		//自定义的TypeFilter。LiuHaoMyAnnotionTest有自己定义的注解LiuhaoCunstom
		LiuHaoMyAnnotionTest liuhao=applicationContext.getBean(LiuHaoMyAnnotionTest.class);
		liuhao.say();

		System.out.println("now send event");
		applicationContext.publishEvent(new CoustomEvent("source","liuhao","sendEmail"," dest liu67224657@qq.com"));

		applicationContext.close();
	}
}
