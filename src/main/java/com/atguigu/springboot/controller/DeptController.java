package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
public class DeptController {

    @Autowired
    EmployeeMapper employeeMapper;

    @ResponseBody
    @GetMapping(value = "/emp/{id}",produces = "application/json;charset=UTF-8")
    public Employee getEmpById(@PathVariable Integer id){
        return employeeMapper.getEmpByid(id);
    }

    @ResponseBody
    @PostMapping("/addEmp")
    public String addEmp(Employee employee){
        //employee.setGender(1);
        //employee.setEmail("1111");
        //employee.setLastName("李四");
        Boolean result = employeeMapper.insertEmp(employee);
        if(result){
            return "sucess";
        }else {
            return "faild";
        }

    }
    @ResponseBody
    @GetMapping("/getEmp")
    public List<Employee> getEmp(){
        return employeeMapper.getEmp();
    }

}
