package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

    public String list(Model model) {
        List<Employee> list = employeeService.queryAll();
       // System.out.println("=>"+list);

        model.addAttribute("list",list);
        return "allemployee";
    }

    @RequestMapping("/toAddemployee")
    public String toAddPaper() {
        return "addemployee";
    }

    @RequestMapping("/addemployee")
    public String addPaper(Employee employees) {
        System.out.println(employees);
        employeeService.addemployee(employees);
        return "redirect:/employee/allemployee";
    }

    @RequestMapping("/toUpdateemployee")
    public String toUpdateemployee(Model model, int id) {
        Employee employee = employeeService.queryemployeeById(id);

        model.addAttribute("employee",employee);
        return "updateemployee";
    }

    @RequestMapping("/updateemployee")
    public String updateemployee(Model model, Employee employees) {
        System.out.println(employees);
        employeeService.updateemployee(employees);
        Employee employee = employeeService.queryemployeeById(employees.getId());
        model.addAttribute("employee", employee);
        return "redirect:/employee/allemployee";
    }
    @RequestMapping("/del/{employeeId}")
    public String deleteemployee(@PathVariable("employeeId") int id) {
        employeeService.deleteemployeeById(id);
        return "redirect:/employee/allemployee";
    }
    @RequestMapping("/queryemployee")
    public String queryBook(String queryemployeeByName,Model model){
        Employee employee = employeeService.queryemployeeByName(queryemployeeByName);
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        model.addAttribute("list",list);

        return "redirect:/employee/allemployee";
    }

}
