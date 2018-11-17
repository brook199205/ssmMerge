package com.atguigu.ssm.beans;

import org.springframework.stereotype.Component;

/**
 * @author HaoLi
 * @date 2018/11/9 - 18:30
 */

@Component
public class Employee {



    private Integer id;
    private String last_name;
    private String email;
    private String gender;
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String last_name, String email, String gender) {
        this.id = id;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
    }

    public Employee(Integer id, String last_name, String email, String gender, Department department) {
        this.id = id;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }
}
