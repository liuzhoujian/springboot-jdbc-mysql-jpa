package com.lzj.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.lzj.springbootmybatis.bean.Employee;
import com.lzj.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @PostMapping("/insert")
    public Employee insertEmp(@RequestBody Employee employee) {
        employeeMapper.insertEmp(employee);
        return employee;
    }

    @GetMapping("/getAll")
    public List<Employee> getAll(@RequestParam("pageNum") Integer pageNum,
                                 @RequestParam("pageSize") Integer pageSize) {

        //设置分页
        PageHelper.startPage(pageNum, pageSize);

        return employeeMapper.getAll();
    }


}
