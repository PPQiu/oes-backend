package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.VO.ExamineeVO;
import cn.aitechlab.oes.VO.LoginVO;
import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.dao.ExamineeMapper;
import cn.aitechlab.oes.dto.UserDTO;
import cn.aitechlab.oes.model.Examinee;
import cn.aitechlab.oes.service.ExamineeService;
import cn.aitechlab.oes.utils.FileUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 16:39
 */
@Service
public class ExamineeServiceImpl implements ExamineeService {

    @Autowired
    private ExamineeMapper examineeMapper;

    //用户登录

    @Override
    public LoginVO login(UserDTO userDTO) {

        LoginVO loginVO = new LoginVO();
        ExamineeVO examineeVO = new ExamineeVO();

        String userId = userDTO.examineeId;
        String userName = userDTO.examineeName;
        String identityNum = userDTO.identityNum;


        if (StringUtils.isBlank(userId)) {
            loginVO.setSuccess(false);
            loginVO.setMsg("学号不能为空");

            return loginVO;
        }

        if (StringUtils.isBlank(userName)) {
            loginVO.setSuccess(false);
            loginVO.setMsg("姓名不能为空");

            return loginVO;
        }

        if (StringUtils.isBlank(identityNum)) {
            loginVO.setSuccess(false);
            loginVO.setMsg("身份证号不能为空");

            return loginVO;
        }


        Examinee examinee = examineeMapper.getExamineeByuserId(userId);

        if (examinee == null) {
            loginVO.setSuccess(false);
            loginVO.setMsg("用户不存在");

            return loginVO;
        }

        loginVO.setSuccess(true);
        loginVO.setMsg("登录成功");
        examineeVO.setType(1);
        examineeVO.setExamineeId(examinee.userId);
        examineeVO.setExamineeName(examinee.userName);
        examineeVO.setIdentityNum(examinee.identityNum);
        loginVO.setUserInfo(examineeVO);

        return loginVO;
    }

    //上传考生信息

    @Override
    public FileUploadMessage uploadExamineeFile(MultipartFile file) {
        FileUploadMessage fileUploadMessage = new FileUploadMessage();
        //总行记录
        List<ArrayList<String>> readResult = null;
        //判断文件是否为空
        if (file.isEmpty()) {
            return new FileUploadMessage(1, "上传文件为空");
        }
        //判断文件大小
        long size = file.getSize();
        String name = file.getOriginalFilename();
        if (StringUtils.isBlank(name) || size == 0) {
            return new FileUploadMessage(1, "上传文件为空");
        }
        //获取文件后缀
        String postfix = FileUtil.getPostfix(name);

        //读取文件内容
        if (StringUtils.equals("xlsx", postfix)) {
            readResult = FileUtil.readXlsx(file);
        } else if (StringUtils.equals("xls", postfix)) {
            readResult = FileUtil.readXls(file);
        } else {
            return new FileUploadMessage(1, "文件类型错误");
        }

        if (readResult == null || readResult.size() == 0) {
            return new FileUploadMessage(2, "文件解析失败");
        }

//        for (ArrayList<String> arr : readResult) {
//            Examinee examinee=new Examinee(Integer.valueOf(arr.get(0)),arr.get(1),arr.get(2),
//                    arr.get(3),Byte.valueOf(arr.get(4)));
//            examineeMapper.uploadExamineeFile(examinee);
//        }
        return new FileUploadMessage(3, "success");
    }


}





