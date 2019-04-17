package cn.aitechlab.oes.service;

import cn.aitechlab.oes.model.Examinfo;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:14
 */
public interface ExaminfoService {
    Examinfo findExaminfoByUserID(String userID);
}
