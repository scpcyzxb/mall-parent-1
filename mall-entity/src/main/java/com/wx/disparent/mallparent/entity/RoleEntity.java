package com.wx.disparent.mallparent.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RoleEntity implements Serializable {
    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();

    private Set<UserEntity> users = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }
}
