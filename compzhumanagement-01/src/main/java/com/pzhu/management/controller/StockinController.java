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
import com.pzhu.management.pojo.Stockin;
import com.pzhu.management.service.CustomerService;
import com.pzhu.management.service.EmployeeService;
import com.pzhu.management.service.MerchandiseService;
import com.pzhu.management.service.StockinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/stockIn")
@Controller
public class StockinController {
    @Autowired
    private StockinService stockinService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private MerchandiseService merchandiseService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/selectStockin")
    public String selectStockin(Model model){
        List<Stockin> list = stockinService.selectStockin();
        model.addAttribute("stock",list);
        return "stockIn";
    }
    @RequestMapping("/insertStockin")
    public String insertStockin(Stockin stockin){
        int i = stockinService.insertStockin(stockin);
        return "redirect:/stockIn/selectStockin";
    }
    @RequestMapping("/deleteStockinByKey")
    public String deleteStockinByKey(@RequestParam("sid") int id){
        int i = stockinService.deleteStockinByKey(id);
        return "redirect:/stockIn/selectStockin";
    }
    @RequestMapping("/updateStockinByKey")
    public String updateStockinByKey(Stockin stockin){
        int i = stockinService.updateStockinByKey(stockin);
        return "redirect:/stockIn/selectStockin";
    }
    @RequestMapping("/selectStockinByKey")
    public String selectStockinByKey(@RequestParam(value = "sid")Integer id, Model model){
       Stockin stockin = stockinService.selectStockinByKey(id);
        model.addAttribute("stt",stockin);
        List<Employee> list = employeeService.selectEmployee();
        List<Merchandise> list1 = merchandiseService.selectMerchandise();
        List<Customer> list11 = customerService.selectCustomer();
        model.addAttribute("Oe",list);
        model.addAttribute("Om",list1);
        model.addAttribute("Ocu",list11);
        return "stockin-update";
    }
    @RequestMapping("/selectStockinSelective")
    public String selectStockinSelective(@RequestParam(value = "sid") Integer id, @RequestParam(value = "ename") String name, Model model){
        System.out.println(id);
        List<Stockin> list = stockinService.selectStockinSelective(id,name);
        model.addAttribute("stock",list);
        return "stockIn";
    }
}
