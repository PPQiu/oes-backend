package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.dto.ExamScoreDTO;
import cn.aitechlab.oes.model.Admin;
import cn.aitechlab.oes.model.Examinee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Admin record);


    int insertSelective(Admin record);


    Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Admin record);


    int updateByPrimaryKey(Admin record);

    Admin getAdminByadminId(@Param("adminId") String adminId);

    //管理员通过考试科目和考试时间查找某场考试所有学生成绩

    List<ExamScoreDTO> selectScoreBySubjectandTime(@Param("examSubject") String examSubject,
                                                   @Param("examDate") String examDate);

    List<ExamScoreDTO> selectScoreByUserId(@Param("userId") String userId);

}