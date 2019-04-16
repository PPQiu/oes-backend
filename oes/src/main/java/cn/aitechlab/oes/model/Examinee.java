package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Examinee {

    //考生信息主键

    public Integer id;

    //考生学号

    public String userId;

    //考生名字

    public String userName;

    //身份证号

    public String identityNum;

    //用户类型

    public Byte userType;


}