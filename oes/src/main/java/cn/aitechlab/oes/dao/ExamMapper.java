package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Exam;

public interface ExamMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Exam record);


    int insertSelective(Exam record);


    Exam selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Exam record);


    int updateByPrimaryKey(Exam record);
}