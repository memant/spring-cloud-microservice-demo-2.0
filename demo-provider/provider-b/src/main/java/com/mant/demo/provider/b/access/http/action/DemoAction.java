package com.mant.demo.provider.b.access.http.action;

import com.mant.demo.api.a.DemoAApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@Component
public class DemoAction {


    @Autowired
    private DemoAApi demoAApi;

    public String get(String id) {

        return String.format("demoB id :%s , name :%s", id, demoAApi.getA(id));
    }
}
