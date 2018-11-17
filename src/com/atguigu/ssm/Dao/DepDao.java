package com.atguigu.ssm.Dao;

import com.atguigu.ssm.beans.Department;
import org.springframework.stereotype.Repository;

/**
 * @author HaoLi
 * @date 2018/11/11 - 15:19
 */

@Repository
public interface DepDao {


    Department getDepById(Integer id);


}
