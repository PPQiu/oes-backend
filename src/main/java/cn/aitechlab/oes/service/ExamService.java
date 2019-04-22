package cn.aitechlab.oes.service;

import cn.aitechlab.oes.dto.ExamQuestionDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/22 9:20
 */
public interface ExamService {

    List<ExamQuestionDTO> showExamQuestion(String examName);

}
