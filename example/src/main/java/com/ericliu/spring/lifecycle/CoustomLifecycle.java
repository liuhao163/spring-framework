package com.ericliu.spring.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/30
 * Description:
 */
@Component
public class CoustomLifecycle implements SmartLifecycle {
	private boolean isRunning = false;

	@Override
	public void start() {
		System.out.println("start");

		// 执行完其他业务后，可以修改 isRunning = true
		isRunning = true;
	}

	@Override
	public void stop() {
		System.out.println("stop");
		isRunning=false;
	}

	@Override
	public boolean isRunning() {
		return this.isRunning;
	}
}
