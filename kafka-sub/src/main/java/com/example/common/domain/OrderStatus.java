package com.example.common.domain;

public enum OrderStatus {
    FAIL("FAIL"), // 실패
    SUCCESS("SUCCESS"); // 성공

    private final String code;

    OrderStatus(String code) {this.code = code;}

    public String getCode() {return code;}
}
