package cn.aitechlab.oes.model;

import lombok.Data;

@Data
public class Exam {

    //试卷主键

    private Integer id;

    //考试信息主键

    private Integer examinfoId;

    //题库信息主键

    private Integer questioninfoId;

}