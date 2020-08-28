package com.xmliu.spboot.entity;

import org.springframework.stereotype.Component;

@Component
public class Permissions {

    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return name;
    }

    public void setPermissionsName(String permissionsName) {
        this.name = permissionsName;
    }
}
