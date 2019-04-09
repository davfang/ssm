/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.controller;

import com.pzhu.management.pojo.Customer;
import com.pzhu.management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/selectCustomer")
    public String selectCustomer(Model model){
        List<Customer> customers = customerService.selectCustomer();
        model.addAttribute("cus",customers);
        return "client-files";
    }
    @RequestMapping("/insertCustomer")
    public String insertCustomer(Customer customer ){
        int i = customerService.insertCustomer(customer);
        return "redirect:/Customer/selectCustomer";
    }
    @RequestMapping("/deleteCustomer")
    public  String deleteCustomer(@RequestParam(value ="cid") int id){
        int i = customerService.deleteCustomer(id);
        return "redirect:/Customer/selectCustomer";
    }
    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer){
        int i = customerService.updateCustomer(customer);
        return "redirect:/Customer/selectCustomer";
    }
    @RequestMapping("/selectCustomerByKey")
    public String selectCustomerByKey(@RequestParam(value = "cid") int id,Model model){
        Customer customer = customerService.selectCustomerByKey(id);
        model.addAttribute("cus",customer);
        return "client-update";
    }
    @RequestMapping("/selectCustomerSelective")
    public String selectCustomerSelective(Customer customer,Model model){
        List<Customer> customers = customerService.selectCustomerSelective(customer);
        model.addAttribute("cus",customers);
        return "client-files";
    }
}
