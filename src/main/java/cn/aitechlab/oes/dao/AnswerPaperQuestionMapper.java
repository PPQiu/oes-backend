package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.AnswerPaperQuestion;

public interface AnswerPaperQuestionMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(AnswerPaperQuestion record);


    int insertSelective(AnswerPaperQuestion record);


    AnswerPaperQuestion selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(AnswerPaperQuestion record);


    int updateByPrimaryKey(AnswerPaperQuestion record);
}