package cn.aitechlab.oes.service;

import cn.aitechlab.oes.model.ExamScore;


import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 21:45
 */
public interface ExamScoreService {

    List<ExamScore> findExamScoreByUserId(String userId);

}
