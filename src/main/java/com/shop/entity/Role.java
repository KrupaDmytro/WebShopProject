package com.shop.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by dima- on 23.10.2016.
 */
public enum Role implements GrantedAuthority {

    USER("USER"),
    MANAGER("MANAGER");
    String name;


    Role(final String name){
        this.name=name;
    }

    @Override
    public String getAuthority() {
        return "ROLE_" + name;
    }
}
