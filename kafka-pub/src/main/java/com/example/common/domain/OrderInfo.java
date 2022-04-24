package com.example.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
@ApiModel
public class OrderInfo implements Serializable {
    @ApiModelProperty(value = "주문 key")
    private String orderId;

    @ApiModelProperty(value = "주문 상태")
    private OrderStatus orderStatus;

    @ApiModelProperty(value = "회원 key")
    private Long memberId;
}
