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
import com.pzhu.management.pojo.Orders;
import com.pzhu.management.service.CustomerService;
import com.pzhu.management.service.EmployeeService;
import com.pzhu.management.service.MerchandiseService;
import com.pzhu.management.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private MerchandiseService merchandiseService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/selectOrders")
    public String selectOrders(Model model){
       List<Orders> orders = ordersService.selectOrders();
       model.addAttribute("ord",orders);
       return "stockOrder";
    }
    @RequestMapping("/insertOrders")
    public String insertOrders(Orders orders){
        int i = ordersService.insertOrders(orders);
        return "redirect:/Orders/selectOrders";
    }
    @RequestMapping("/deleteOrdersByKey")
    public String deleteOrdersByKey(@RequestParam("oid") int id){
        int i = ordersService.deleteOrdersByKey(id);
        return "redirect:/Orders/selectOrders";
    }
    @RequestMapping("/updateOrdersByKey")
    public String updateOrdersByKey(Orders orders){
        int i = ordersService.updateOrdersByKey(orders);
        return "redirect:/Orders/selectOrders";
    }
    @RequestMapping("/selectOrdersByKey")
    public String selectOrdersByKey(@RequestParam(value = "oid")Integer id,Model model){
        Orders orders = ordersService.selectOrdersByKey(id);
        model.addAttribute("ord",orders);
        List<Employee> list = employeeService.selectEmployee();
        List<Merchandise> list1 = merchandiseService.selectMerchandise();
        List<Customer> list11 = customerService.selectCustomer();
        model.addAttribute("Oe",list);
        model.addAttribute("Om",list1);
        model.addAttribute("Ocu",list11);
        return "order-update";
    }
    @RequestMapping("/selectOrdersSelective")
    public String selectOrdersSelective(@RequestParam(value = "oid") Integer id, @RequestParam(value = "mname") String name, Model model){
        List<Orders> orders = ordersService.selectOrdersSelective(id,name);
        model.addAttribute("ord",orders);
        return "stockOrder";
    }

}
