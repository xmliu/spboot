package com.xmliu.spboot.entity;

import com.xmliu.spboot.entity.Permissions;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Role {

    String id;
    String roleName;

    String permissions;

//    public Role(String id, String roleName, Set<Permissions> permissions) {
//        this.id = id;
//        this.roleName = roleName;
//        this.permissions = permissions;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermissions() {
        return permissions;
    }

//    public void setPermissions(Set<Permissions> permissions) {
//        this.permissions = permissions;
//    }
}
