package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Classname: UserMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 11:10
 * @Version: v1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from sky_take_out.user where openid = #{openid};")
    User getByOpenid(String openid);

    void insert(User user);
}
