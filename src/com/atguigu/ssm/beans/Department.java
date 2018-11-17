package com.atguigu.ssm.beans;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HaoLi
 * @date 2018/11/11 - 11:52
 */

@Component
public class Department {
    private Integer id;
    private String depName;
    private List<Employee> employeeList;


    public Department() {
    }

    public Department(Integer id, String dep_name) {
        this.id = id;
        this.depName = dep_name;
    }

    public Department(Integer id, String depName, List<Employee> employeeList) {
        this.id = id;
        this.depName = depName;
        this.employeeList = employeeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
