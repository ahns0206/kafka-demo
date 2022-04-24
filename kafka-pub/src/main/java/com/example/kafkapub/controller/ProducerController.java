package com.example.kafkapub.controller;


import com.example.common.domain.OrderInfoResponse;
import com.example.common.domain.OrderInfo;
import com.example.kafkapub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class ProducerController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/sendOrderStatus", method=RequestMethod.POST)
    public OrderInfoResponse sendOrderStatus(@RequestBody final OrderInfo orderInfo) throws Exception {
        return orderService.sendOrderStatus(orderInfo);
    }
}
