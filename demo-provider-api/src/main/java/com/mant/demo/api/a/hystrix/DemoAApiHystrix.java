package com.mant.demo.api.a.hystrix;

import com.mant.demo.api.a.DemoAApi;
import org.springframework.stereotype.Component;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@Component
public class DemoAApiHystrix implements DemoAApi {

    @Override
    public String getA(String id) {
        return "error:hystrix";
    }
}
