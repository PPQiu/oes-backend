package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.QuestionInfo;

public interface QuestionInfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(QuestionInfo record);


    int insertSelective(QuestionInfo record);


    QuestionInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(QuestionInfo record);


    int updateByPrimaryKey(QuestionInfo record);
}