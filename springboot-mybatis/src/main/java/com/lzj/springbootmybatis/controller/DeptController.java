package com.lzj.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.lzj.springbootmybatis.bean.Department;
import com.lzj.springbootmybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/query/{id}")
    public Department queryDepartmentById(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartmentById(id);
    }

    @GetMapping("/delete/{id}")
    public int deleteDepartmentById(@PathVariable("id") Integer id) {
        return departmentMapper.deleteDepartmentById(id);
    }

    @PostMapping("/update")
    public Department updateDepartmentById(Department department) {
        System.out.println("更新department");
        departmentMapper.updateDepartment(department);
        return department;
    }

    @PostMapping("/insert")
    public Department insertDepartmentById(@RequestBody Department department) {
        System.out.println(department);
        departmentMapper.insertDepartment(department);
        return department;
    }

    @GetMapping("/getAll")
    public List<Department> getAll(@RequestParam("pageNum") Integer pageNum,
                                   @RequestParam("pageSize") Integer pageSize) {

        //设置分页
        PageHelper.startPage(pageNum, pageSize);

        return departmentMapper.getAllDepartment();
    }
}
