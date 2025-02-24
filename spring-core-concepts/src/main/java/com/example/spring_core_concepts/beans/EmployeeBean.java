package com.example.spring_core_concepts.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//UC_03
@Component
@Scope("prototype")
public class EmployeeBean {
    private String empName;

    @Autowired
    private DepartmentBean department;

    // Default constructor
    public EmployeeBean() {}

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department.getDeptName());
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public DepartmentBean getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee details:<br>" +
                "Name = " + empName + "<br>" +
                "Department = " + department.getDeptName();
    }
}

