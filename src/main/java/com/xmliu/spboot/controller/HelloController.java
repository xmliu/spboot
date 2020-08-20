package com.xmliu.spboot.controller;

import com.xmliu.spboot.bean.Author;
import com.xmliu.spboot.bean.Bus;
import com.xmliu.spboot.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private Author author;

    @Autowired
    private BusService busService;

    @RequestMapping("/hello")
    public String hello(){
        List<Bus> result = busService.queryAll();
        return "名字：" + result.get(0).getName() + ",This is xmliu " + author.getCsdnUrl();
    }
}
