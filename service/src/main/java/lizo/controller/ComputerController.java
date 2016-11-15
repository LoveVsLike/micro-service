package lizo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;
@RefreshScope
@RestController
public class ComputerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${my.name}")
    private String name;

    @RequestMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }


    @RequestMapping("/name")
    public String name() {
        logger.info("########### call me!!!!!!");
        return name;
    }


}
