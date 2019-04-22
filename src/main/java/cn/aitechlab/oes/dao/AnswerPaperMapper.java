package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.AnswerPaper;

public interface AnswerPaperMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(AnswerPaper record);


    int insertSelective(AnswerPaper record);

    AnswerPaper selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(AnswerPaper record);


    int updateByPrimaryKey(AnswerPaper record);
}