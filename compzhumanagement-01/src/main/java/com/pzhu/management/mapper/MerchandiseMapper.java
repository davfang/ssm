package com.pzhu.management.mapper;

import com.pzhu.management.pojo.Merchandise;
import com.pzhu.management.pojo.MerchandiseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MerchandiseMapper {
    int countByExample(MerchandiseExample example);

    int deleteByExample(MerchandiseExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    List<Merchandise> selectByExample(MerchandiseExample example);

    Merchandise selectByPrimaryKey(Integer mid);

    List<Merchandise> selectMerchandise();

    int updateByExampleSelective(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByExample(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);

    List<Merchandise> selectMerchandiseSelective(Merchandise merchandise);
}