package lizo.controller;

import lizo.service.ComputerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 李周 on 2016/11/13.
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
