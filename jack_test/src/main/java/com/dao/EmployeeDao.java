package com.dao;

import com.pojo.Employee;

import java.util.List;

/**
 * @Author:Wujie
 * @Date: 2020/9/25 9:25
 * @Version 1.0
 */
public interface EmployeeDao {
    List<Employee> queryAll();
}
