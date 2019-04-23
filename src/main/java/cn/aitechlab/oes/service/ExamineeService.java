package cn.aitechlab.oes.service;

import cn.aitechlab.oes.VO.LoginVO;
import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.dto.UserDTO;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 16:38
 */
public interface ExamineeService {

    LoginVO login(UserDTO userDTO);

    FileUploadMessage uploadExamineeFile(MultipartFile file);

}
