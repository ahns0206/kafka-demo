package com.example.kafkapub.service;


import com.example.common.domain.OrderInfoResponse;
import com.example.common.domain.OrderInfo;

public interface OrderService {
    public OrderInfoResponse sendOrderStatus(OrderInfo orderInfo) throws Exception;
}
