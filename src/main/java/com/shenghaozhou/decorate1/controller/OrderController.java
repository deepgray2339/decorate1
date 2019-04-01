package com.shenghaozhou.decorate1.controller;

import com.shenghaozhou.decorate1.entity.Order;
import com.shenghaozhou.decorate1.repository.OrderMapper;
import com.shenghaozhou.decorate1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/o")
public class OrderController {

    private final OrderMapper orderMapper;
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderMapper orderMapper, OrderService orderService) {
        this.orderMapper = orderMapper;
        this.orderService = orderService;
    }

    @RequestMapping(value = "/generate", method = RequestMethod.GET)
    @ResponseBody
    public Integer generateOrder(Order order) {
        for (String s : order.getStyle()) {
            System.out.println(s);
        }

        return orderService.generate(order);

    }

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Order> getOrders() {
        return orderMapper.findAll();
    }
}
