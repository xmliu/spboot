package com.xmliu.spboot.service;

import com.xmliu.spboot.entity.Permissions;
import com.xmliu.spboot.entity.Person;
import com.xmliu.spboot.entity.Role;

public interface LoginService {

    Person getUserByName(String getMapByName);
    Role getRoleByUser(String id);
    Permissions getPermissionByRole(String id);
}
