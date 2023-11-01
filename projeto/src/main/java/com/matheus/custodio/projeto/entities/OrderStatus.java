package com.matheus.custodio.projeto.entities;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    OrderStatus(int i) {
        code = i;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int i){
        for(OrderStatus value: OrderStatus.values()){
            if(i==value.getCode()){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
