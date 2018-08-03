package com.spring.aop.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.ShapeService;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("AopConfig.xml");
		
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().getName();
		//shapeService.getCircle().setName("abc");
		//shapeService.getCircle().getValue();
		//shapeService.getSquare().getName();
		ctx.close();

	}

}
