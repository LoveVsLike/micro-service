package com.micro.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientController {
	private Logger logger = LoggerFactory.getLogger(ClientController.class);

	@Value("${my.name}")
	private String name;

	@RequestMapping("/add")
	public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
		logger.info("a:{},b:{}",a,b);
	/*	try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		return a + b;
	}

	@RequestMapping("/name")
	public String name() {
		logger.info("########### call me!!!!!!");
		return name;
	}

}
