package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.QuestionInfo;
import org.apache.ibatis.annotations.Insert;

public interface QuestionInfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(QuestionInfo record);


    int insertSelective(QuestionInfo record);


    QuestionInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(QuestionInfo record);


    int updateByPrimaryKey(QuestionInfo record);

    @Insert({"insert into questioninfo values(#{id},#{questionType},#{questionLevel},#{questionContent},#{optionA},#{optionB},#{optionC},#{optionD},#{optionE},#{optionF},#{correctAnswer},#{correctScore})"})
    int uploadFile(QuestionInfo questionInfo);



}