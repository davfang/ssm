/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.OrdersMapper;
import com.pzhu.management.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    public List<Orders> selectOrders(){
        List<Orders> orders = ordersMapper.selectOrders();
        return orders;
    }
    public int insertOrders(Orders orders){
        int i = ordersMapper.insert(orders);
        return i;
    }
    public int deleteOrdersByKey(int id){
        int i = ordersMapper.deleteByPrimaryKey(id);
        return i;
    }
    public int updateOrdersByKey(Orders orders){
        int i = ordersMapper.updateByPrimaryKey(orders);
        return i;
    }
    public Orders selectOrdersByKey(Integer id){
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        return orders;
    }
    public List<Orders> selectOrdersSelective(Integer oid,String mname){
        List<Orders> orders = ordersMapper.selectOrdersSelective(oid,mname);
        return orders;
    }
}
