package cn.aitechlab.oes.service;

import cn.aitechlab.oes.constsnt.FileUploadMessage;
import cn.aitechlab.oes.constsnt.Loginstate;
import cn.aitechlab.oes.model.Vo.UserVo;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 16:38
 */
public interface ExamineeService {

    Loginstate login(UserVo userVo);

    FileUploadMessage uploadExamineeFile(MultipartFile file);

}
