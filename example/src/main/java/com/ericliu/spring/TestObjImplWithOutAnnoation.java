package com.ericliu.spring;

import org.springframework.stereotype.Component;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/04
 * Description:
 */
@Component
public class TestObjImplWithOutAnnoation implements TestObj  {

	private String name="";

//	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public String getName() {
		return name;
	}

	public TestObjImplWithOutAnnoation setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public void hello() {
		System.out.println("hello!! i am bean without Component :"+name);
	}
}
