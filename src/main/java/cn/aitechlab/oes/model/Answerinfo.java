package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class AnswerInfo {

    //答题信息主键

    private Integer id;

    //成绩表主键

    private Integer examscoreId;

    //试卷表主键

    private Integer examId;

    //学生答案

    private String answer;

    //对错标记

    private Byte flag;

    }