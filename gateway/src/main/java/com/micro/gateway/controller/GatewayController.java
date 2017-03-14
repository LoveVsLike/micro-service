package com.micro.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.gateway.service.ComputerFeignService;

/**
 * 网关控制
 * 
 * @author Dream
 *
 */
@RestController
public class GatewayController {

    @Autowired
    ComputerFeignService computerFeignService;

//    @Autowired
//    ComputerFeignService computerRibbonService;

    @RequestMapping("/getadd")
    public int getadd(@RequestParam("a") int a,@RequestParam("b") int b){
        return computerFeignService.add(a,b);
    }

    @RequestMapping("/getName")
    public String getName(){
        return computerFeignService.name();
    }


}
