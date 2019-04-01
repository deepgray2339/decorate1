package com.shenghaozhou.decorate1.service;

import com.shenghaozhou.decorate1.entity.Order;
import com.shenghaozhou.decorate1.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public Integer generate(Order order) {
        order.setSStyle();
        return orderMapper.save(order);
    }
}
