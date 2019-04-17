package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Answerinfo;

public interface AnswerinfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Answerinfo record);


    int insertSelective(Answerinfo record);


    Answerinfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Answerinfo record);


    int updateByPrimaryKey(Answerinfo record);
}