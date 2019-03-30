package com.order.search.simple.dao;

import java.util.HashSet;
import java.util.Set;

public class OrderDao {
    private Set<String> orders = new HashSet<>();

    public boolean register(String number){
        return orders.add(number);
    }

    public Set<String> findAll(){
        return orders;
    }
}
