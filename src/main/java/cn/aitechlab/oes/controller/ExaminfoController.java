package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.model.ExamInfo;
import cn.aitechlab.oes.service.ExamInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:23
 */
@RestController
@RequestMapping("/exam")
public class ExamInfoController {
    @Autowired
    private ExamInfoService examInfoService;

    @GetMapping("/detail")
    public List<ExamInfo> getExamInfo(@Param ("userId") String userId){
         System.out.println(userId);
         List<ExamInfo>  examInfoList  = examInfoService.findExamInfoByUserId(userId);
        return examInfoList;
    }
}
