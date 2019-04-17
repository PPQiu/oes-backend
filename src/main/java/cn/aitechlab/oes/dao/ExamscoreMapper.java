package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.ExamScore;

public interface ExamScoreMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ExamScore record);


    int insertSelective(ExamScore record);


    ExamScore selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ExamScore record);


    int updateByPrimaryKey(ExamScore record);
}