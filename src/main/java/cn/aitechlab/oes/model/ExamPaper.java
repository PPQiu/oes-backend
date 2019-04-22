package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class ExamPaper {

    private Integer id;

    //试卷信息主键

    private Integer examinfoId;

   //成绩信息主键

    private Integer examscoreId;

   //答卷信息主键

    private Integer answerpaperId;

   }