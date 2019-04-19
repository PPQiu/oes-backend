package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Examinee;
import cn.aitechlab.oes.model.QuestionInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


public interface ExamineeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);

    Examinee getExamineeByuserId(@Param("userId") String userId);

    @Insert({"insert into examinee values(#{id},#{userId},#{userName},#{identityNum},#{userType})"})
    int uploadExamineeFile(Examinee examinee);


}