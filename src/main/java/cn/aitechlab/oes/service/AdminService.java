package cn.aitechlab.oes.service;

import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.dto.ExamScoreDTO;
import cn.aitechlab.oes.model.Vo.UserVo;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 11:04
 */
public interface AdminService {

    Loginstate login(UserVo userVo);

    List<ExamScoreDTO> getExamineeScore(String examSubject,String examDate);

    List<ExamScoreDTO> getExamineeScoreByUserId(String userId);
}
