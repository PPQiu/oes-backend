package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.ExamPaper;

public interface ExamPaperMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ExamPaper record);


    int insertSelective(ExamPaper record);


    ExamPaper selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ExamPaper record);


    int updateByPrimaryKey(ExamPaper record);
}