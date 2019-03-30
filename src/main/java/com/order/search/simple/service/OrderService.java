package com.order.search.simple.service;

import com.order.search.simple.dao.OrderDao;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderService {
    private OrderDao dao = new OrderDao();

    public Set<String> findAll(){
        return dao.findAll();
    }

    public boolean register(String number){
        return dao.register(number);
    }

    public List<String> search(String query){
        Set<String> orders = findAll();
        return orders.stream()
                .filter(order -> order.toUpperCase().contains(query.toUpperCase()))
                .collect(Collectors.toList());
    }
}
