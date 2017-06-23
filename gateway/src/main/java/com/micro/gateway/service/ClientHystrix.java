package com.micro.gateway.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ClientHystrix implements ClientFeignService {
    @Override
    public int add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return -111919;
    }

    @Override
    public String name() {
        return "exception";
    }
}