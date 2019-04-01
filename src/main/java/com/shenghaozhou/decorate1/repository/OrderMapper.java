package com.shenghaozhou.decorate1.repository;

import com.shenghaozhou.decorate1.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Insert("insert into `orders` values (#{id},#{customerName},#{phoneNumber},#{type},#{sStyle}) ")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "customer_name", property = "customerName"),
            @Result(column = "phone_number", property = "phoneNumber"),
            @Result(column = "type", property = "type"),
            @Result(column = "style", property = "sStyle")
    })
    Integer save(Order order);

    @Select("select * from `orders`")
    List<Order> findAll();
}
