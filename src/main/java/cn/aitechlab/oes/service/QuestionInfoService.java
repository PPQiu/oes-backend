package cn.aitechlab.oes.service;

import cn.aitechlab.oes.constsnt.FileUploadMessage;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/18 21:51
 */
public interface QuestionInfoService {

    FileUploadMessage uploadQuestionFile(MultipartFile file);
}
