package com.example.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class OrderInfoResponse {
    private String orderId;
    private String message;

    public OrderInfoResponse(String orderId, String message) {
        this.orderId = orderId;
        this.message = message;
    }
}
