package com.mant.demo.provider.a.access.http.controller;


import com.mant.demo.provider.a.access.http.action.DemoAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoAction demoAction;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam String id) {

        return demoAction.get(id);

    }
}
