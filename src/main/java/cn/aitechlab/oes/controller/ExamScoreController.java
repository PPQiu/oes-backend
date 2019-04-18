package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.model.ExamScore;
import cn.aitechlab.oes.service.ExamScoreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 21:54
 */
@RestController
@RequestMapping("/exam")
public class ExamScoreController {
    @Autowired
    private ExamScoreService examScoreService;

    @GetMapping("/score")
    public List<ExamScore> getExamScore(@Param("userId") String userId){
        List<ExamScore> examScoreList = examScoreService.findExamScoreByUserId(userId);
        return examScoreList;
    }

}
