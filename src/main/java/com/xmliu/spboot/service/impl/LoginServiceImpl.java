package com.xmliu.spboot.service.impl;

import com.xmliu.spboot.entity.Permissions;
import com.xmliu.spboot.entity.Person;
import com.xmliu.spboot.entity.Role;
import com.xmliu.spboot.mapper.LoginMapper;
import com.xmliu.spboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Person getUserByName(String userName) {
        Person person = loginMapper.findOnePerson(userName);
        System.out.println("username = " + person.getUserName());
        System.out.println("password = " + person.getPassword());
        System.out.println("personRoles = " + person.getRole());
        return person;
    }

    @Override
    public Role getRoleByUser(String name) {
        Role role = loginMapper.findRoleById(name);
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("rolePermission = " + role.getPermissions());
        return role;
    }

    @Override
    public Permissions getPermissionByRole(String name) {
        Permissions permissions = loginMapper.findPermissionById(name);
        System.out.println("permissionId = " + permissions.getId());
        System.out.println("permissionName = " + permissions.getPermissionsName());
        return permissions;
    }

    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
//    private Person getMapByName(String userName) {
//        //共添加两个用户，两个用户都是admin一个角色，
//        //wsl有query和add权限，zhangsan只有一个query权限
//        Permissions permissions1 = new Permissions("1","query");
//        Permissions permissions2 = new Permissions("2","add");
//        Set<Permissions> permissionsSet = new HashSet<>();
//        permissionsSet.add(permissions1);
//        permissionsSet.add(permissions2);
//        Set<Permissions> permissionsSet = loginMapper.findAllPermissions();
//        Role role = new Role("1","admin",permissionsSet);
//        Set<Role> roleSet = new HashSet<>();
//        roleSet.add(role);
//        Person user = new Person("1","wsl","123456",roleSet);
//        Map<String ,Person> map = new HashMap<>();
//        map.put(user.getUserName(), user);
//
//        Permissions permissions3 = new Permissions("3","query");
//        Set<Permissions> permissionsSet1 = new HashSet<>();
//        permissionsSet1.add(permissions3);
//        Role role1 = new Role("2","user",permissionsSet1);
//        Set<Role> roleSet1 = new HashSet<>();
//        roleSet1.add(role1);
//        Person user1 = new Person("2","zhangsan","123456",roleSet1);
//        map.put(user1.getUserName(), user1);
//
//
//        return map.get(userName);
//    }
}
