/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.MerchandiseMapper;
import com.pzhu.management.pojo.Merchandise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandiseService {
    @Autowired
    private MerchandiseMapper merchandiseMapper;
    public List<Merchandise> selectMerchandise(){
        List<Merchandise> merchandises = merchandiseMapper.selectMerchandise();
        return merchandises;
    }
    public int insertMerchandise(Merchandise merchandise){
        int i = merchandiseMapper.insert(merchandise);
        return i;
    }
    public int deleteMerchandise(int id){
        int i = merchandiseMapper.deleteByPrimaryKey(id);
        return i;
    }
    public Merchandise selectMerchandiseByKey(int id){
        Merchandise merchandise = merchandiseMapper.selectByPrimaryKey(id);
        return merchandise;
    }
    public int updateMerchandise(Merchandise merchandise){
        int i = merchandiseMapper.updateByPrimaryKey(merchandise);
        return i;
    }
    public List<Merchandise> selectMerchandiseSelective(Merchandise merchandise){
        List<Merchandise> merchandises = merchandiseMapper.selectMerchandiseSelective(merchandise);
        return merchandises;
    }
}
