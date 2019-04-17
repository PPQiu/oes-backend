package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.AnswerInfo;

public interface AnswerInfoMapper {


    int deleteByPrimaryKey(Integer id);


    int insert(AnswerInfo record);


    int insertSelective(AnswerInfo record);


    AnswerInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(AnswerInfo record);


    int updateByPrimaryKey(AnswerInfo record);
}