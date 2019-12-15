package com.ericliu.spring.scaner;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/15
 * Description:
 */
@Component
public class MyTypeFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		AnnotationMetadata annotationMetadate = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类的信息
		ClassMetadata classMethod = metadataReader.getClassMetadata();
		//获取当前类资源
		Resource resource = metadataReader.getResource();
		String className = classMethod.getClassName();
		if(annotationMetadate.getClassName().equals("com.ericliu.spring.scaner.LiuHaoMyAnnotionTest")){
			return true;
		}
		return false;
	}
}
