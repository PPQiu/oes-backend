package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.dao.ExaminfoMapper;
import cn.aitechlab.oes.model.Examinfo;
import cn.aitechlab.oes.service.ExaminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:14
 */
@Service
public class ExaminfoServiceImpl implements ExaminfoService {
    @Autowired
    private ExaminfoMapper examinfoMapper;

    public Examinfo findExaminfoByUserID(@RequestParam("userID") String userID){
        Examinfo examinfo = examinfoMapper.selectExaminfoByUserID(userID);
        return examinfo;
    }
}
