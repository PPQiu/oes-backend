package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Examscore {

    //成绩信息主键

    private Integer id;

   //考生信息主键

    private Integer examineeId;

    //考试信息主键

    private Integer examinfoId;

    //考生成绩

    private Integer examScore;


    }