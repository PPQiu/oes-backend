package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.dao.ExamineeMapper;
import cn.aitechlab.oes.model.Examinee;
import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.service.ExamineeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 16:39
 */
@Service
public class ExamineeServiceImpl implements ExamineeService {

    @Autowired
    private ExamineeMapper examineeMapper;

    public Loginstate login(String userId, String userName, String identityNum,Byte user_type) {

        if (StringUtils.isBlank(userId)) {

            return new Loginstate(0, "学号不能为空");
        }
        if (StringUtils.isBlank(userName)) {
            return new Loginstate(0, "用户名不能为空");
        }
        if (StringUtils.isBlank(identityNum)) {
            return new Loginstate(0, "身份证号不能为空");
        }

        Examinee examinee = examineeMapper.getExamineeByuserID(userId);

        if (examinee == null) {
            return new Loginstate(0, "用户不存在");

        }
        return new Loginstate(1, "登录成功");

    }


}





