package com.prasad.jms.example.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.prasad.jms.example.sender.JmsSender;

public class MainJmsLauncher {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/applicationContext.xml");
		ctx.refresh();

		JmsSender sender = ctx.getBean("messageSender", JmsSender.class);
		sender.sendMessage("hello jms3");
	}

}
