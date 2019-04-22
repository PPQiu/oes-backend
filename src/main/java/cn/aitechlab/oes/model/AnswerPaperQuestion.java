package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class AnswerPaperQuestion {

    private Integer id;

    //答卷主键

    private Integer answerpaperId;

    //答卷题目信息主键

    private Integer answerquestionId;

   }