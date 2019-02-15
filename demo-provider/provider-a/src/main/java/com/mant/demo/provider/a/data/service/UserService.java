package com.mant.demo.provider.a.data.service;

import com.mant.demo.provider.a.model.dto.UserDto;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
public interface UserService {

    UserDto findOne(long id);

}
