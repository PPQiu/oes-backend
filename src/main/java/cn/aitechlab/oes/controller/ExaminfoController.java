package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.model.Examinfo;
import cn.aitechlab.oes.service.ExaminfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:23
 */
@RestController
@RequestMapping("/exam")
public class ExaminfoController {
    @Autowired
    private ExaminfoService examinfoService;

    @GetMapping("/detail")
    public Examinfo getExaminfo(@Param("userId") String userId){
        Examinfo examinfo = examinfoService.findExaminfoByUserID(userId);
        return examinfo;
    }
}
