package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Questioninfo {

    //题库信息主键

    private Integer id;

   //题目类型

    private Integer questionType;

    //题目难度

    private Integer questionLevel;

    //题目内容

    private String questionContent;

    //选项A

    private String optionA;

    //选项B

    private String optionB;

    //选项C

    private String optionC;

    //选项D

    private String optionD;

    //选项E

    private String optionE;

    //选项F

    private String optionF;

    //正确答案

    private String correctAnswer;

    //正确分数

    private Integer correctScore;

    }