package com.lee.service.impl;

import com.lee.pojo.Dept;
import com.lee.service.DeptService;

public class DeptServiceImpl implements DeptService {
    @Override
    public Dept findById(Integer id) {
        Dept dept = new Dept();
        dept.setId(id);
        dept.setDeptName("营业部");
        dept.setDbSource("本地库");
        return dept;
    }
}
