package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.ExamInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamInfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(ExamInfo record);


    int insertSelective(ExamInfo record);


    ExamInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(ExamInfo record);


    int updateByPrimaryKey(ExamInfo record);

    List<ExamInfo> selectExamInfoByUserId(@Param("userId") String userId);


}