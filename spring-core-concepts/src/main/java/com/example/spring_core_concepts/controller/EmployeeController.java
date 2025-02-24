package com.example.spring_core_concepts.controller;

import com.example.spring_core_concepts.beans.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    //Get prototype beans dynamically
    private ApplicationContext context;

    //store latest employee details
    private EmployeeBean employee;

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeBean emp) {
        //Get a new instance
        employee = context.getBean(EmployeeBean.class);
        employee.setEmpName(emp.getEmpName());
        employee.setDepartment(emp.getDepartment());
        return "✅ Employee details added successfully!";
    }

    @GetMapping("/details")
    public String showEmployeeDetails() {
        if (employee == null) {
            return "⚠ No employee details available!";
        }
        return employee.toString();
    }
}
