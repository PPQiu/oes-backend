package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.model.Examinee;
import cn.aitechlab.oes.constsnt.Loginstate;

import cn.aitechlab.oes.service.ExamineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 15:49
 */
@RestController
@RequestMapping("/user")
public class ExamineeController {

    @Autowired
    private ExamineeService examineeService;

    @PostMapping("/login")

    public Loginstate login(@RequestBody Examinee examinee) {
        String userId = examinee.userId;
        String userName = examinee.userName;
        String identityNum = examinee.identityNum;
        Byte userType = examinee.userType;
        Loginstate loginstate = examineeService.login(userId, userName, identityNum, userType);
        return loginstate;
    }

}

