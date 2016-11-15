package lizo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 李周 on 2016/11/13.
 */
@Component
public class ComputeClientHystrix implements ComputerFeignService{
    @Override
    public int add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return -111919;
    }

    @Override
    public String name() {
        return "exception";
    }
}