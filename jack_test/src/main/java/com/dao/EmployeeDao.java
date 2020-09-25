package com.dao;

import com.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:Wujie
 * @Date: 2020/9/25 9:25
 * @Version 1.0
 */
public interface EmployeeDao {
    //增
    int addemployee(Employee employee);
    //删
    int deleteemployeeById(@Param("employeeId") int Id);
    //改
    int updateemployee(Employee employee);
    //查
    Employee queryemployeeById(@Param("employeeId") int id);
    //查all
    List<Employee> queryAll();
    //
    Employee queryemployeeByName(String employeeName);


}
