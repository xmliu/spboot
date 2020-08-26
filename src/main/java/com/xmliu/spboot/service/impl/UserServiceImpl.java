package com.xmliu.spboot.service.impl;

import com.xmliu.spboot.entity.User;
import com.xmliu.spboot.mapper.UserMapper;
import com.xmliu.spboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
