package com.lzj.springbootmybatis.mapper;

import com.lzj.springbootmybatis.bean.Employee;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    List<Employee> getAll();
}
