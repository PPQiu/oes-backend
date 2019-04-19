package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Examinee {

    //考生信息主键

    public String id;

    //考生学号

    public String userId;

    //考生名字

    public String userName;

    //身份证号

    public String identityNum;

    //用户类型

    public String userType;

    public Examinee(String id, String userId, String userName, String identityNum, String userType) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.identityNum = identityNum;
        this.userType = userType;
    }
}