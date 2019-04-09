/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.CustomerMapper;
import com.pzhu.management.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

     public List<Customer> selectCustomer(){
         List<Customer> customers = customerMapper.selectCustomer();
         return customers;
     }
     public int insertCustomer(Customer customer){
        int i = customerMapper.insert(customer);
        return i;
     }
     public int deleteCustomer(int id){
         int i = customerMapper.deleteByPrimaryKey(id);
         return i;
     }
     public int updateCustomer(Customer customer){
       int i = customerMapper.updateByPrimaryKey(customer);
       return i;
     }
     public Customer selectCustomerByKey(int id){
         Customer customer = customerMapper.selectByPrimaryKey(id);
         return customer;
     }
     public List<Customer> selectCustomerSelective(Customer customer){
         List<Customer> customers = customerMapper.selectCustomerSelective(customer);
         return customers;
     }
}
