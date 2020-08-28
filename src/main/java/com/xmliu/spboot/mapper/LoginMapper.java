package com.xmliu.spboot.mapper;

import com.xmliu.spboot.entity.Permissions;
import com.xmliu.spboot.entity.Person;
import com.xmliu.spboot.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Set;

@Mapper
@Component
public interface LoginMapper {
    Person findOnePerson(String userName);
    Role findRoleById(String id);
    Permissions findPermissionById(String id);
}
