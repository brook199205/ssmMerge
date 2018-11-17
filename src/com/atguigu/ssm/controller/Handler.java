package com.atguigu.ssm.controller;

import com.atguigu.ssm.Dao.DepDao;
import com.atguigu.ssm.Dao.EmpDao;
import com.atguigu.ssm.beans.Employee;
import com.atguigu.ssm.service.EmpManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HaoLi
 * @date 2018/11/13 - 8:21
 */


@Controller
public class Handler {

    @Autowired
    private EmpManager empManager;


    //测试test，trim，where等标签
    @RequestMapping(value = "/getEmp", method = RequestMethod.GET)
    public String getEmp() {
        System.out.println("处理了请求");
        Employee employee = new Employee();
        employee.setLast_name("Jack");
//        System.out.println(employee);
        Employee empByEmpInfo = empManager.getEmpByEmpInfo(employee);
        System.out.println(employee);
        return "success";


    }


    //    测试用foreach标签批量插入数据
    @RequestMapping(value = "/addBatch", method = RequestMethod.GET)
    public String addBatch() {
        System.out.println("处理了批量插入请求");
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(null, "yapeng", "peng@qq.com", "male", null));
        list.add(new Employee(null, "yayun", "yun@qq.com", "male", null));
        list.add(new Employee(null, "zhihua", "hua@qq.com", "female", null));
        System.out.println(empManager.addBatch(list) + "行数据被插入");
        return "success";
    }
}
