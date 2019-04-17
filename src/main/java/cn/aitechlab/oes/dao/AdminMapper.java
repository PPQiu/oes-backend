package cn.aitechlab.oes.dao;

import cn.aitechlab.oes.model.Admin;
import cn.aitechlab.oes.model.Examinee;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Admin record);


    int insertSelective(Admin record);


    Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Admin record);


    int updateByPrimaryKey(Admin record);

    Admin getAdminByadminId(@Param("adminId") String adminId);
}