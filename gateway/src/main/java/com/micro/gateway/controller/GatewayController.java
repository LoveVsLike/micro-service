package com.micro.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.gateway.service.ClientFeignService;

/**
 * 网关控制
 * 
 * @author Dream
 *
 */
@RestController
public class GatewayController {

	@Autowired
	ClientFeignService clientFeignService;

	@RequestMapping("/getadd")
	public int getadd(@RequestParam("a") int a, @RequestParam("b") int b) {
		return clientFeignService.add(a, b);
	}

	@RequestMapping("/getName")
	public String getName() {
		return clientFeignService.name();
	}

}
