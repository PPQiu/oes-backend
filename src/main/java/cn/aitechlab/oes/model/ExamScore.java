package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class ExamScore {

    //成绩表主键

    private Integer id;

   //学号

    private String userId;

    //考试信息表主键

    private Integer examinfoId;

    //成绩

    private Integer examScore;



   }