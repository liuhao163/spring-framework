package com.ericliu.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
@Component
public class TestObjImpl implements TestObj  {

	private String name="";

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public String getName() {
		return name;
	}

	public TestObjImpl setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public void hello() {
		System.out.println("hello!! i am "+name);
	}
}
