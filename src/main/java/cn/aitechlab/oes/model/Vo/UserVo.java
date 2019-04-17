package cn.aitechlab.oes.model.Vo;

import lombok.Data;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 10:50
 */
@Data
public class UserVo {

    //考生学号

    public String userId;

    //考生名字

    public String userName;

    //身份证号

    public String identityNum;

    //管理员账号

    public String adminId;

    //管理员密码

    public String password;

    public Byte userType;
}
