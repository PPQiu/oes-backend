package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.VO.LoginVO;
import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.dao.AdminMapper;
import cn.aitechlab.oes.dto.ExamScoreDTO;
import cn.aitechlab.oes.dto.UserDTO;
import cn.aitechlab.oes.model.Admin;
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
    public LoginVO login(UserDTO userDTO){

        LoginVO loginVO = new LoginVO();
        String adminId = userDTO.adminId;
        String password = userDTO.password;

        if (StringUtils.isBlank(adminId)) {

            loginVO.setSuccess(false);
            loginVO.setMsg("账号不能为空");
            return loginVO;
        }
        if (StringUtils.isBlank(password)) {

            loginVO.setSuccess(false);
            loginVO.setMsg("密码不能为空");
            return loginVO;
        }


        Admin admin = adminMapper.getAdminByadminId(adminId);
            if (admin == null){

                loginVO.setSuccess(false);
                loginVO.setMsg("账号或密码错误");
                return loginVO;
            }
             loginVO.setSuccess(true);
             loginVO.setMsg("登陆成功");
             return loginVO;
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


