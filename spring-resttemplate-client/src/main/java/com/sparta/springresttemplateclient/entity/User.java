package com.sparta.springresttemplateclient.entity;

import lombok.Getter;
// 간단하게 JPA 사용하는 거 아니고 그냥 일반 DB 연동하는 class - 정보만 담고있음 (Entity class 아님)
@Getter
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}