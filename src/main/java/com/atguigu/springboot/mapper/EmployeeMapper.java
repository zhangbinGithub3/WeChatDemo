package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
@Repository
public interface EmployeeMapper {

    public Employee getEmpByid(Integer id);

    public Boolean insertEmp(Employee employee);

    public List<Employee> getEmp();

}
