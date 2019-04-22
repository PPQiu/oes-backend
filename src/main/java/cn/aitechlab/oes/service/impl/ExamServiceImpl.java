package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.dao.ExamMapper;
import cn.aitechlab.oes.dto.ExamQuestionDTO;
import cn.aitechlab.oes.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/22 9:20
 */
@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public List<ExamQuestionDTO> showExamQuestion(@RequestParam("examName") String examName){
        List<ExamQuestionDTO> examQuestionDTOList = examMapper.selectExamQuestionByexamName(examName);
        return examQuestionDTOList;
    }
}
