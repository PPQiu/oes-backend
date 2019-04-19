package cn.aitechlab.oes.dto;

import lombok.Data;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/18 9:49
 */
@Data
public class ExamScoreDTO {

    private String userId;

    private String userName;

    private String examDate;

    public String examSubject;

    public String examScore;


}
