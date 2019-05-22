package com.yizhile.mapper;


import com.yizhile.domain.People;
import org.apache.ibatis.annotations.Select;

public interface PeopleMapper {

    @Select("insert into people(name,age,sex) values(#{name},#{age},#{sex});")
    Integer insertPeople(People people);
}
