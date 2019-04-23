package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.ExamScore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamScoreMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ExamScore record);


    int insertSelective(ExamScore record);


    ExamScore selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ExamScore record);


    int updateByPrimaryKey(ExamScore record);

    List<ExamScore> selectExamScoreByUserId(@Param("userId") String userId);
}