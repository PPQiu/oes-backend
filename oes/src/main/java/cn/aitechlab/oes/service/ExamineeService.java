package cn.aitechlab.oes.service;

import cn.aitechlab.oes.constsnt.Loginstate;


/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 16:38
 */
public interface ExamineeService {

    Loginstate login(String userId, String username, String identity_num,Byte user_type);

}
