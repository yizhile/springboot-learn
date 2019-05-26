package com.yizhile.controller;

import com.yizhile.domain.People;
import com.yizhile.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    //添加一个People信息到数据库中
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Integer add(@RequestBody People people){
        return peopleService.addPeople(people);
    }
}
