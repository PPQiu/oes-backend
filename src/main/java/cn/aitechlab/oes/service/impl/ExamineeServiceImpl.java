package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.dao.ExamineeMapper;
import cn.aitechlab.oes.model.Admin;
import cn.aitechlab.oes.model.Examinee;
import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.model.QuestionInfo;
import cn.aitechlab.oes.model.Vo.UserVo;
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
    public Loginstate login(UserVo userVo) {

        String userId = userVo.userId;
        String userName = userVo.userName;
        String identityNum = userVo.identityNum;


        if (StringUtils.isBlank(userId)) {

            return new Loginstate(0, "学号不能为空");
        }
        if (StringUtils.isBlank(userName)) {
            return new Loginstate(0, "用户名不能为空");
        }
        if (StringUtils.isBlank(identityNum)) {
            return new Loginstate(0, "身份证号不能为空");
        }


        Examinee examinee = examineeMapper.getExamineeByuserId(userId);

        if (examinee == null) {

            return new Loginstate(0, "用户不存在");
        }
        return new Loginstate(1, "登录成功");
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

        for (ArrayList<String> arr : readResult) {
            Examinee examinee=new Examinee(Integer.valueOf(arr.get(0)),arr.get(1),arr.get(2),
                    arr.get(3),Byte.valueOf(arr.get(4)));
            examineeMapper.uploadExamineeFile(examinee);
        }
        return new FileUploadMessage(3, "success");
    }


}





