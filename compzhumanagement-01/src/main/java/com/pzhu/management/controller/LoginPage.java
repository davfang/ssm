/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.controller;

import com.pzhu.management.pojo.Customer;
import com.pzhu.management.pojo.Employee;
import com.pzhu.management.pojo.Merchandise;
import com.pzhu.management.service.CustomerService;
import com.pzhu.management.service.EmployeeService;
import com.pzhu.management.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes(value={"Ocu","Oe","Om"})
@Controller
@RequestMapping("/page")
public class LoginPage {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private MerchandiseService merchandiseService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/employee-insert")
    public String emplopyeeinsert(){
        return "employee-insert";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("goods-insert")
    public String goodsinsert(){
        return "goods-insert";
    }
    @RequestMapping("client-insert")
    public String clientinsert(){
        return "client-insert";
    }
    @RequestMapping("order-insert")
    public String orderinsert(Model model){
        List<Employee> list = employeeService.selectEmployee();
        List<Merchandise> list1 = merchandiseService.selectMerchandise();
        List<Customer> list11 = customerService.selectCustomer();
        model.addAttribute("Oe",list);
        model.addAttribute("Om",list1);
        model.addAttribute("Ocu",list11);
        return "order-insert";
    }
    @RequestMapping("stockin-insert")
    public String stockininsert(Model model){
        List<Employee> list = employeeService.selectEmployee();
        List<Merchandise> list1 = merchandiseService.selectMerchandise();
        List<Customer> list11 = customerService.selectCustomer();
        model.addAttribute("Oe",list);
        model.addAttribute("Om",list1);
        model.addAttribute("Ocu",list11);
        return "stockin-insert";
    }
}
