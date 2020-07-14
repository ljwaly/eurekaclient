package com.ljw.eureka.client.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ljw.eureka.client.remote.NounClient;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		FeignClient annotationFeignClient = NounClient.class.getAnnotation(FeignClient.class);
		
		String name = annotationFeignClient.name();
		System.out.println("name=" + name);
		
		String url = annotationFeignClient.url();
		System.out.println("url=" + url);
		
		String value = annotationFeignClient.value();
		System.out.println("value=" + value);
		
		
		
		Method method = NounClient.class.getDeclaredMethod("getWord", String.class);

		RequestMapping declaredAnnotationRequestMapping = method.getDeclaredAnnotation(RequestMapping.class);
		
		String[] value1 = declaredAnnotationRequestMapping.value();
		for (String string : value1) {
			System.out.println("string="+string);
			
		}
		RequestMethod[] method2 = declaredAnnotationRequestMapping.method();
		for (RequestMethod requestMethod : method2) {
			System.out.println("requestMethod="+requestMethod);
		}
		
	}
}
