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



    public int addemployee(Employee employee) {
        return employeeDao.addemployee(employee);
    }

    public int deleteemployeeById(int Id) {
        return employeeDao.deleteemployeeById(Id);
    }

    public int updateemployee(Employee employee) {
        return employeeDao.updateemployee(employee);
    }

    public Employee queryemployeeById(int id) {
        return employeeDao.queryemployeeById(id);
    }

    public List<Employee> queryAll() {
        return employeeDao.queryAll();
    }

    public Employee queryemployeeByName(String employeeName) {
        return employeeDao.queryemployeeByName(employeeName);
    }
}
