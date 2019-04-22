package cn.aitechlab.oes.service.impl;

import cn.aitechlab.oes.utils.FileUtil;
import cn.aitechlab.oes.dao.QuestionInfoMapper;
import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.model.QuestionInfo;
import cn.aitechlab.oes.service.QuestionInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/18 21:52
 */
@Service
public class QuestionInfoServiceImpl implements QuestionInfoService {
    @Autowired
    private QuestionInfoMapper questionInfoMapper;

    @Override
    public FileUploadMessage uploadQuestionFile(MultipartFile file) {
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
            QuestionInfo questionInfo=new QuestionInfo(Integer.valueOf(arr.get(0)),Integer.valueOf(arr.get(1)),Integer.valueOf(arr.get(2)),
                    arr.get(3),arr.get(4),arr.get(5),arr.get(6),arr.get(7),arr.get(8),
                    arr.get(9),arr.get(10),Integer.valueOf(arr.get(11)));
            questionInfoMapper.uploadFile(questionInfo);
        }
        return new FileUploadMessage(3, "success");
    }

}
