package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Answerinfo {

    //答题信息表主键

    private Integer id;

    //成绩信息表主键

    private Integer examscoreId;

    //试卷主键

    private Integer examId;

    //考生答案

    private String answer;

    //对错标记

    private Byte flag;

}