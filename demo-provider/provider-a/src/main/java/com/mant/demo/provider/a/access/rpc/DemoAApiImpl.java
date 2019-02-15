package com.mant.demo.provider.a.access.rpc;

import com.mant.demo.api.a.DemoAApi;
import com.mant.demo.provider.a.data.service.UserService;
import com.mant.demo.provider.a.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@RestController
public class DemoAApiImpl implements DemoAApi {

    @Autowired
    private UserService userService;

    @Override
    public String getA(@RequestParam("id") String id) {

        UserDto userDto = userService.findOne(Long.valueOf(id));
        if(userDto!=null){
            return userDto.name;
        }
        return null;
    }
}
