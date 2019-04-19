package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.dao.AdminMapper;
import cn.aitechlab.oes.dto.ExamScoreDTO;
import cn.aitechlab.oes.model.Admin;
import cn.aitechlab.oes.model.ExamScore;
import cn.aitechlab.oes.model.Vo.UserVo;
import cn.aitechlab.oes.service.AdminService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/17 11:05
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    //管理员登录

    @Override
    public Loginstate login(UserVo userVo){

        String adminId = userVo.adminId;
        String password = userVo.password;

        if (StringUtils.isBlank(adminId)) {

            return new Loginstate(0, "账号不能为空");
        }
        if (StringUtils.isBlank(password)) {

            return new Loginstate(0, "密码不能为空");
        }


        Admin admin = adminMapper.getAdminByadminId(adminId);
            if (admin == null){

                return new Loginstate(0, "账号或密码错误");
            }
            return new Loginstate(1, "登录成功");
        }

        @Override
        public List<ExamScoreDTO> getExamineeScore(@RequestParam("examSubject") String examSubject,
                                                   @RequestParam("examDate") String examDate){
                    List<ExamScoreDTO> examScoreDTOList = adminMapper.selectScoreBySubjectandTime(examSubject,examDate);
                    return examScoreDTOList;
        }
        @Override
        public List<ExamScoreDTO> getExamineeScoreByUserId(@RequestParam("userId") String userId){
            List<ExamScoreDTO> examScoreDTOList = adminMapper.selectScoreByUserId(userId);
            return examScoreDTOList;
        }


    }


