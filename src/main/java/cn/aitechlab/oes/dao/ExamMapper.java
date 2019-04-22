package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.dto.ExamQuestionDTO;
import cn.aitechlab.oes.model.Exam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Exam record);


    int insertSelective(Exam record);


    Exam selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Exam record);


    int updateByPrimaryKey(Exam record);

    List<ExamQuestionDTO> selectExamQuestionByexamName(@Param("examName") String examName);
}