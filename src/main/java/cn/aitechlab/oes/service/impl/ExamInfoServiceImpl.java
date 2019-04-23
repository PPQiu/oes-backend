package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.dao.ExamInfoMapper;
import cn.aitechlab.oes.model.ExamInfo;
import cn.aitechlab.oes.service.ExamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:14
 */
@Service
public class ExamInfoServiceImpl implements ExamInfoService {
    @Autowired
    private ExamInfoMapper examInfoMapper;

    @Override
    public List<ExamInfo> findExamInfoByUserId(@RequestParam("userId") String userId){
        List<ExamInfo> examInfoList = examInfoMapper.selectExamInfoByUserId(userId);
        return examInfoList;
    }
}
