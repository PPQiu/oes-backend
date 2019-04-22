package cn.aitechlab.oes.model;

import lombok.Data;

import java.util.Date;

@Data

public class AnswerPaper {

    //答卷信息主键

    private Integer id;

    //提交答卷时间

    private Date submitTime;

    //答卷名称

    private String paperName;

   //答卷人学号

    private String answerUserid;

   //是否改卷

    private String checked;


    //是否答完卷

    private String finished;

   }