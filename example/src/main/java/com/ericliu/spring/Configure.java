package com.ericliu.spring;

import com.ericliu.spring.scaner.LiuhaoCunstom;
import com.ericliu.spring.scaner.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.FilterType;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/15
 * Description:
 */
@ComponentScan(value = "com.ericliu.spring.**", includeFilters = {
		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = true)//这里要写true否则，component等注解都无法使用
@Configuration
@EnableLoadTimeWeaving
public class Configure {
}
