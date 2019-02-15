package com.mant.demo.api.a;

import com.mant.demo.api.a.hystrix.DemoAApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@FeignClient(name = "provider-a",fallback = DemoAApiHystrix.class)
public interface DemoAApi  {

    @RequestMapping("/api/a/rpc/getA")
    String getA(@RequestParam("id") String id);
}
