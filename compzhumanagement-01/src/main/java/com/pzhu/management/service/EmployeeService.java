/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date: 2019-3-28 16:23
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.EmployeeMapper;
import com.pzhu.management.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    public EmployeeMapper getEmployeeMapper()
    {
        return employeeMapper;
    }

    public void setEmployeeMapper(EmployeeMapper employeeMapper)
    {
        this.employeeMapper = employeeMapper;
    }
    //查找全部员工
    public List<Employee> selectEmployee(){
        List<Employee> list = employeeMapper.selectEmployee();
        return  list;
    }
    //增加员工
    public int insertEmployee(Employee employee){
        int i = employeeMapper.insert(employee);
        return i;
    }
    //删除员工
    public int deleteEmployee(int id){
        int i = employeeMapper.deleteByPrimaryKey(id);
        return i;
    }
    //修改员工
    public int updateEmployee(Employee employee){
        int i = employeeMapper.updateByPrimaryKey(employee);
        return i;
    }
    //根据id查找员工
    public Employee selectByPrimaryKey(int id){
       Employee employee = employeeMapper.selectByPrimaryKey(id);
       return employee;
    }
    //根据员工编号和姓名模糊查询
    public List<Employee> selectEmployeeSelective(Employee employee){
        List<Employee> employee1 = employeeMapper.selectEmployeeSelective(employee);
        return employee1;
    }
}
