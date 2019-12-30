package com.ericliu.spring.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/29
 * Description:
 */
@Component
public class CoustomAppliationLiterner implements ApplicationListener<CoustomEvent> {

	//触发 application.pulish(new ContextRefreshedEvent())
	@Override
	public void onApplicationEvent(CoustomEvent event) {
		System.out.println(event.getName() + " eventType:" + event.getEventType() + " summary:" + event.getSummary() + " in time:" + event.getTimestamp());
	}
}
