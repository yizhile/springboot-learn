package com.yizhile.service.impl;

import com.yizhile.domain.People;
import com.yizhile.mapper.PeopleMapper;
import com.yizhile.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceimpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public Integer addPeople(People people) {
        return peopleMapper.insertPeople(people);
    }
}
