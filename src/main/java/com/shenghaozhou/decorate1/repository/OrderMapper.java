package com.shenghaozhou.decorate1.repository;

import com.shenghaozhou.decorate1.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Insert("insert into `orders` values (#{customerName},#{phoneNumber},#{type},#{sStyle}) ")
    int save(Order order);

    @Select("select * from `orders`")
    List<Order> findAll();
}
