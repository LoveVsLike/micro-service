package lizo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 李周 on 2016/11/13.
 */
@FeignClient(value = "computer",fallback = ComputeClientHystrix.class)
public interface ComputerFeignService {
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    int add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    @RequestMapping(value = "/name",method = RequestMethod.POST)
    String name();


}


