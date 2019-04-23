package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class ExamInfo {

    //考试信息主键

    private Integer id;

    //考试科目

    private String examSubject;

    //考试名称

    private String examName;

    //考试内容

    private String examContent;


    //考试日期

    private String examDate;

    //考试时间

    private String examTime;

    //考试时长

    private String totalTime;

    //备注

    private String remark;


}