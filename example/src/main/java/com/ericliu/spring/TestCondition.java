package com.ericliu.spring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: liuhaoeric
 * Create time: 2020/01/06
 * Description:
 */
public class TestCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println(context.getBeanFactory().getBeansOfType(TestObjImplWithOutAnnoation.class));
		return true;
	}
}
