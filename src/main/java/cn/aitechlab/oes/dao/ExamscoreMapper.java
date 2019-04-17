package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Examscore;

public interface ExamscoreMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examscore record);


    int insertSelective(Examscore record);


    Examscore selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Examscore record);


    int updateByPrimaryKey(Examscore record);
}