package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.dto.ExamQuestionDTO;
import cn.aitechlab.oes.model.ExamInfo;
import cn.aitechlab.oes.service.ExamService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/22 9:25
 */
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;


    @GetMapping("/questionlist")
    public List<ExamQuestionDTO> showExamQuestionList(@Param("examName") String examName){
        System.out.println(examName);
        List<ExamQuestionDTO>  examQuestionDTOList  = examService.showExamQuestion(examName);
        return examQuestionDTOList;
    }


}
