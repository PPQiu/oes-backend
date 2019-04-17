package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Questioninfo;

public interface QuestioninfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Questioninfo record);


    int insertSelective(Questioninfo record);


    Questioninfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Questioninfo record);


    int updateByPrimaryKey(Questioninfo record);
}