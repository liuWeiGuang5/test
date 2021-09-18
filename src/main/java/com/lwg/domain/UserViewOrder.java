package com.lwg.domain;

import java.util.List;

public class UserViewOrder extends User {
    private List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "UserViewOrder{" +
                "orders=" + orders +
                '}';
    }
}
