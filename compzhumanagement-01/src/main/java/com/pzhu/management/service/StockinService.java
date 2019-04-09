/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.StockinMapper;
import com.pzhu.management.pojo.Stockin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockinService {
    @Autowired
    private StockinMapper stockinMapper;
    public List<Stockin> selectStockin(){
        List<Stockin> list = stockinMapper.selectStockin();
        return list;
    }
    public int deleteStockinByKey(int id){
        int i = stockinMapper.deleteByPrimaryKey(id);
        return i;
    }
    public int insertStockin(Stockin stockin){
        int i = stockinMapper.insert(stockin);
        return i;
    }
    public int updateStockinByKey(Stockin stockin){
        int i = stockinMapper.updateByPrimaryKey(stockin);
        return  i;
    }
    public Stockin selectStockinByKey(int id){
        Stockin stockin = stockinMapper.selectStockinByKey(id);
        return stockin;
    }
    public List<Stockin> selectStockinSelective(Integer sid,String ename){
        System.out.println(sid);
       List<Stockin> list = stockinMapper.selectStockinSelective(sid,ename);
       return list;
    }

}
