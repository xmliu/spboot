package com.xmliu.spboot.mapper;

import com.xmliu.spboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    List<User> findAll();
}
