package cn.itcast.crud.dao;

import cn.itcast.crud.bean.department;
import cn.itcast.crud.bean.departmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface departmentMapper {
    long countByExample(departmentExample example);

    int deleteByExample(departmentExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(department record);

    int insertSelective(department record);

    List<department> selectByExample(departmentExample example);

    department selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") department record, @Param("example") departmentExample example);

    int updateByExample(@Param("record") department record, @Param("example") departmentExample example);

    int updateByPrimaryKeySelective(department record);

    int updateByPrimaryKey(department record);
}