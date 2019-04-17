package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Examinee;
import org.apache.ibatis.annotations.Select;

public interface ExamineeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);

    Examinee getExamineeByuserID(String userId);
}