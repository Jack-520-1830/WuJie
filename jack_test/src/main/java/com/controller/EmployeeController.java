package com.controller;

import com.pojo.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:Wujie
 * @Date: 2020/9/25 9:24
 * @Version 1.0
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    @Qualifier("EmployeeServiceImpl")
    private EmployeeService employeeService;
    @RequestMapping("/allemployee")

    public String list(Model model){
        List<Employee> list = employeeService.queryAll();
       // System.out.println("=>"+list);
        model.addAttribute("list",list);
        return "allemployee";
    }


}
