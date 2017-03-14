package com.micro.gateway.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Dream
 *
 */
@FeignClient(value = "computer", fallback = ComputeClientHystrix.class)
public interface ComputerFeignService {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	int add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

	@RequestMapping(value = "/name", method = RequestMethod.POST)
	String name();

}
