package com.mant.demo.provider.a.data.service.impl;

import com.mant.demo.provider.a.data.mapper.UserMapper;
import com.mant.demo.provider.a.data.service.UserService;
import com.mant.demo.provider.a.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto findOne(long id) {
        return userMapper.selectOne(id);
    }
}
