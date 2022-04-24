package com.example.kafkapub.service;

import com.example.common.domain.OrderInfoResponse;
import com.example.common.domain.OrderInfo;
import com.example.kafkapub.publish.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderProducer orderProducer;

    @Override
    public OrderInfoResponse sendOrderStatus(OrderInfo orderInfo) throws Exception {
        orderProducer.sendMessage(orderInfo);

        return new OrderInfoResponse(orderInfo.getOrderId(),"order send success");
    }
}
