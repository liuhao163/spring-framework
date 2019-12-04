package com.ericliu.spring;

import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
@Component
public class TestObjImpl implements TestObj  {

	@Override
	public void hello() {
		System.out.println("hello!!");
	}
}
