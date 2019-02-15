package com.mant.demo.provider.a.access.http.action;

import com.mant.demo.provider.a.data.service.UserService;
import com.mant.demo.provider.a.model.dto.UserDto;
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
    private UserService userService;

    public String get(String id) {

        UserDto userDto = userService.findOne(Long.valueOf(id));
        String name  = null;
        if(userDto!=null){
            name = userDto.name;
        }
        return String.format("demoA id :%s , name :%s",id,name);

    }
}
