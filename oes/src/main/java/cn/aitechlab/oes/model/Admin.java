package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Admin {

    //管理员主键

    private Integer id;

    //管理员账号

    private String adminId;

    //管理员密码

    private String password;

    //用户类型

    private Byte userType;

}