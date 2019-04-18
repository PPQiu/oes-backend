package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.dao.ExamScoreMapper;
import cn.aitechlab.oes.model.ExamScore;
import cn.aitechlab.oes.service.ExamScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 21:48
 */
@Service
public class ExamScoreServiceImpl implements ExamScoreService {
    @Autowired
    private ExamScoreMapper examScoreMapper;

    @Override
    public List<ExamScore> findExamScoreByUserId(@RequestParam("userId") String userId) {
        List<ExamScore> examScoreList = examScoreMapper.selectExamScoreByUserId(userId);
        return examScoreList;



    }
}

