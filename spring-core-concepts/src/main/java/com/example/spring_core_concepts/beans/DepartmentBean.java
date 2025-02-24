package com.example.spring_core_concepts.beans;
import org.springframework.stereotype.Component;

//UC_03
@Component
public class DepartmentBean {
    private String deptName = "IT Department";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
