package com.example.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class OrderInfo implements Serializable {
    private String orderId;
    private OrderStatus orderStatus;
    private Long memberId;

    //기본 생성자 추가
    public OrderInfo() {
    }

    @Override
    public String toString() {
        return orderId + ", " + memberId + ", " + orderStatus;
    }
}