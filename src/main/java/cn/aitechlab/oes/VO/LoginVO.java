package cn.aitechlab.oes.VO;

import lombok.Data;

@Data
public class LoginVO {

    // 登录状态
    public Boolean success;

    // 返回信息
    public String msg;

    ExamineeVO userInfo;
}
