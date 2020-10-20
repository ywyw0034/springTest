package com.yilaguan.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {

    private Integer id;
    private String name;
    private String password;
}
