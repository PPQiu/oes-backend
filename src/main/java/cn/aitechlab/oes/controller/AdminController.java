package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.dto.ExamScoreDTO;
import cn.aitechlab.oes.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/18 11:24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //管理员通过考试时间和科目查看某场考试所有学生成绩score1

    //管理员通过考生学号查看某学生所有成绩score2

    //待尝试合并

    @GetMapping("/score1")
    public List<ExamScoreDTO> getExamineeScore(@Param("examSubject") String examSubject,
                                               @Param("examDate") String examDate){
        System.out.println(examSubject);
        System.out.println(examDate);
        List<ExamScoreDTO> examScoreDTOList = adminService.getExamineeScore(examSubject,examDate);
        return examScoreDTOList;
    }
   @GetMapping("/score2")
    public List<ExamScoreDTO> getExamineeScoreByUserId(@Param("userId") String userId){

        List<ExamScoreDTO> examScoreDTOList = adminService.getExamineeScoreByUserId(userId);
        return examScoreDTOList;
    }
}
