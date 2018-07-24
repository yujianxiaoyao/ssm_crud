package cn.itcast.crud.dao;

import cn.itcast.crud.bean.employee;
import cn.itcast.crud.bean.employeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface employeeMapper {
    long countByExample(employeeExample example);

    int deleteByExample(employeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(employee record);

    int insertSelective(employee record);

    List<employee> selectByExample(employeeExample example);

    employee selectByPrimaryKey(Integer empId);
    //查询结果带有部门表的根据条件的选择查询
    List<employee> selectByExampleWithDept(employeeExample example);
    //查询结果带有部门表的根据id查询
    employee selectByPrimaryKeyWithDept(Integer empId);

    int updateByExampleSelective(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByExample(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}