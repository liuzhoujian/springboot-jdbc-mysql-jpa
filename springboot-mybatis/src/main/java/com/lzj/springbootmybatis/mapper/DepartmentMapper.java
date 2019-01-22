package com.lzj.springbootmybatis.mapper;

import com.lzj.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper  在springboot主类中配置统一扫描
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDepartmentById(Integer id);

    @Delete("DELETE FROM department WHERE id = #{id}")
    int deleteDepartmentById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id") //返回自增主键
    @Insert("INSERT INTO department(departmentName) VALUES (#{departmentName})")
    int insertDepartment(Department department);

    @Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
    Department updateDepartment(Department department);

    //分页获取所有信息
    @Select("SELECT * FROM department")
    List<Department> getAllDepartment();
}
