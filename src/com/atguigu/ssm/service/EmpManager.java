package com.atguigu.ssm.service;

import com.atguigu.ssm.Dao.DepDao;
import com.atguigu.ssm.Dao.EmpDao;
import com.atguigu.ssm.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author HaoLi
 * @date 2018/11/13 - 8:27
 */

@Service
public class EmpManager {


    @Autowired
    private EmpDao empDao;
    @Autowired
    private DepDao depDao;


    public Employee getEmpByEmpInfo(Employee employee) {
        return empDao.getEmpsByEmpInfo(employee);
    }

    public Integer addBatch(List<Employee> list) {
        return empDao.batchAddEmp(list);
    }

}
