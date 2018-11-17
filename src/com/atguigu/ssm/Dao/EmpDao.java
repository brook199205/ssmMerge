package com.atguigu.ssm.Dao;

import com.atguigu.ssm.beans.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author HaoLi
 * @date 2018/11/9 - 21:45
 */

@Repository
public interface EmpDao {


    Employee getEmpById(Integer id);


    Integer addEmp(Employee employee);

    //获取集合
    List<Employee> getEmpsById(Integer id);

    //获取map,@MapKey指定结果中的哪个列作为键，(多用主键)
    @MapKey("id")
    Map<Object, Object> getEmpsMap(Integer id);


    //    传入多个参数给sql
    Integer insertOne(@Param("table") String tabel, @Param("id") Integer id, @Param("lastName") String lastName,
                      @Param("email") String email, @Param("gender") String gender);


    Employee getEmpByIdStep(Integer id);

    List<Employee> getEmpsByDepid(Integer depid);


    Employee getEmpsByEmpInfo(Employee employee);

    Integer batchAddEmp(List<Employee> list);

}
