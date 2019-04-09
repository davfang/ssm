/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.controller;

import com.pzhu.management.pojo.Employee;
import com.pzhu.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //查找全部员工
    @RequestMapping("/selectEmployee")
    public ModelAndView selectEmployee(){
        List<Employee> list = employeeService.selectEmployee();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("employee-files");
        return modelAndView;
    }
    //增加员工
    @RequestMapping("/insertEmployee")
    public String insertEmployee(Employee employee){
        int i = employeeService.insertEmployee(employee);//i可以判断是否成功
        return "redirect:/Employee/selectEmployee";
    }
    //删除员工
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam(value = "eid") Integer id){
        int i = employeeService.deleteEmployee(id);
        return "redirect:/Employee/selectEmployee";
    }
    //修改员工
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
      int i = employeeService.updateEmployee(employee);
        return "redirect:/Employee/selectEmployee";
    }
    //根据id查找员工
    @RequestMapping("/selectByPrimaryKey")
    public ModelAndView selectByPrimaryKey(@RequestParam(value = "eid") Integer id){
        Employee employee = employeeService.selectByPrimaryKey(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employee-update");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
    //根据员工编号和姓名模糊查询
    @RequestMapping("/selectEmployeeSelective")
    public String selectEmployeeSelective(Employee employee,Model model){
        List<Employee> employee1 = employeeService.selectEmployeeSelective(employee);
        model.addAttribute("list",employee1);
        return "employee-files";
    }
}
