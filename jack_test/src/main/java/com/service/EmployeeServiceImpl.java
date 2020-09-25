package com.service;

import com.dao.EmployeeDao;
import com.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Wujie
 * @Date: 2020/9/25 9:26
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> queryAll() {
        return employeeDao.queryAll();
    }
}
