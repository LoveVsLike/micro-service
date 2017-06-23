package com.micro.ribbon.controller;

import com.micro.ribbon.config.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dream on 2017/6/23.
 */
@RestController
public class UserController {

  @Autowired
  RestTemplate restTemplate;

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String hi(@RequestParam("a") int a, @RequestParam("b") int b) {
    String url = "http://client/add?" + "a=" + a + "&b=" + b;
    int greeting = restTemplate.getForObject(url, Integer.class);
    return String.valueOf(greeting);
  }

}
