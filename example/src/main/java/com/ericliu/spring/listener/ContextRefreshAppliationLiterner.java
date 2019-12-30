package com.ericliu.spring.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/29
 * Description:
 */
@Component
public class ContextRefreshAppliationLiterner implements ApplicationListener<ApplicationContextEvent> {

	public static ApplicationContext applicationContextEvent;

	@Override
	public void onApplicationEvent(ApplicationContextEvent event) {
		System.out.println("this is sys event" + event);
		applicationContextEvent=event.getApplicationContext();
	}
}
