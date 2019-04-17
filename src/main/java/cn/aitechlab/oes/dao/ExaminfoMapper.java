package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Examinfo;
import org.apache.ibatis.annotations.Param;

public interface ExaminfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examinfo record);


    int insertSelective(Examinfo record);


    Examinfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Examinfo record);


    int updateByPrimaryKey(Examinfo record);

    Examinfo selectExaminfoByUserID(@Param("userId") String userID);


}