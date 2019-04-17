package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class QuestionInfo {

    //题库主键

    private Integer id;

    //题型

    private Integer questionType;

    //难度

    private Integer questionLevel;

    //题干

    private String questionContent;

    //选项A

    private String optionA;

   //选项B

    private String optionB;

    //选项C

    private String optionC;

    //选项D

    private String optionD;

    //选项D

    private String optionE;

    //选项E

    private String optionF;

    //选项F

    private String correctAnswer;

    //正确答案

    private Integer correctScore;



   }