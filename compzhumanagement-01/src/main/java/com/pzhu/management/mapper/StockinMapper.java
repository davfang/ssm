package com.pzhu.management.mapper;

import com.pzhu.management.pojo.Stockin;
import com.pzhu.management.pojo.StockinExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StockinMapper {
    int countByExample(StockinExample example);

    int deleteByExample(StockinExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Stockin record);

    int insertSelective(Stockin record);

    List<Stockin> selectByExample(StockinExample example);

    Stockin selectStockinByKey(Integer sid);

    int updateByExampleSelective(@Param("record") Stockin record, @Param("example") StockinExample example);

    int updateByExample(@Param("record") Stockin record, @Param("example") StockinExample example);

    int updateByPrimaryKeySelective(Stockin record);

    int updateByPrimaryKey(Stockin record);

    List<Stockin> selectStockin();


    List<Stockin> selectStockinSelective(@Param("sid") Integer sid,@Param("ename") String ename);
}