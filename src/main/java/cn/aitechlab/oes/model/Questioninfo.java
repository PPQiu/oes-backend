package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class QuestionInfo {

    //题库主键

    private String id;

    //题型

    private String questionType;

    //难度

    private String questionLevel;

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

    private String correctScore;

    public QuestionInfo(String id, String questionType, String questionLevel, String questionContent, String optionA, String optionB, String optionC, String optionD, String optionE, String optionF, String correctAnswer, String correctScore) {
        this.id = id;
        this.questionType = questionType;
        this.questionLevel = questionLevel;
        this.questionContent = questionContent;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.optionF = optionF;
        this.correctAnswer = correctAnswer;
        this.correctScore = correctScore;
    }
}