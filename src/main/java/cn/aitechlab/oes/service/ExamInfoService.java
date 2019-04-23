package cn.aitechlab.oes.service;

        import cn.aitechlab.oes.model.ExamInfo;

        import java.util.List;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/16 10:14
 */
public interface ExamInfoService {
     List<ExamInfo>  findExamInfoByUserId(String userId);
}
