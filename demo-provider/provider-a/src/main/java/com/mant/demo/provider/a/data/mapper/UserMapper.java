package com.mant.demo.provider.a.data.mapper;

import com.mant.demo.provider.a.model.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@Mapper
public interface UserMapper {

    UserDto selectOne(long id);
}
