package com.shenghaozhou.decorate1.controller;

import com.shenghaozhou.decorate1.entity.Order;
import com.shenghaozhou.decorate1.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/o")
public class OrderController {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderController(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @RequestMapping("/generate")
    public void generateOrder(Order order) {
        System.out.println(order);
        // return orderMapper.save(order);
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Order> getOrders() {
        return orderMapper.findAll();
    }
}
