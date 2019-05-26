package com.yizhile.mapper;

import com.yizhile.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into public.user(user_name,user_password,user_status) values(#{user_name},#{user_password},#{user_status});")
    public abstract Integer insertUser(User user);

    @Select("select * from public.user where user_name = #{user_name}")
    public abstract User selectUserByUsername(String user_name);
}
