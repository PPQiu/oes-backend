package cn.aitechlab.oes.controller;

import cn.aitechlab.oes.VO.LoginVO;
import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.constsnt.Loginstate;

import cn.aitechlab.oes.dto.UserDTO;
import cn.aitechlab.oes.service.AdminService;
import cn.aitechlab.oes.service.ExamineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 15:49
 */
@RestController
public class ExamineeController {

    @Autowired
    private ExamineeService examineeService;

    @Autowired
    private AdminService adminService;

    @PostMapping("/user/login")

    public LoginVO login(@RequestBody UserDTO userDTO) {

        Byte userType = userDTO.userType;

        if(userType == 1){

            LoginVO loginVO = examineeService.login(userDTO);

            return loginVO;
        }else{

            LoginVO loginVO = adminService.login(userDTO);

            return loginVO;
        }

    }
    @PostMapping("/upload/examineeInfo")
    public FileUploadMessage uploadExamineeFile(@RequestParam MultipartFile file) {
        FileUploadMessage fileUploadMessage = null;
        fileUploadMessage = examineeService.uploadExamineeFile(file);
        return fileUploadMessage;
    }

}



