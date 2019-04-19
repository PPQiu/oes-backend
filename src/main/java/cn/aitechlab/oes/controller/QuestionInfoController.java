package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.service.QuestionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/19 9:25
 */
@RestController
@RequestMapping("/exam")
public class QuestionInfoController {
    @Autowired
    private QuestionInfoService questionInfoService;

    @PostMapping("/upload/question")
    public FileUploadMessage uploadQuestion(@RequestParam MultipartFile file) {
        FileUploadMessage fileUploadMessage = null;
        fileUploadMessage = questionInfoService.uploadQuestionFile(file);
        return fileUploadMessage;
    }

}
