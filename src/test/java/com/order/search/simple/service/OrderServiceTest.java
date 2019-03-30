package com.order.search.simple.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
import java.util.Set;

@RunWith(JUnit4.class)
public class OrderServiceTest {
    private OrderService service = new OrderService();

    @Test
    public void testFindAll() {
        int actual = service.findAll().size();

        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testRegister() {
        boolean registred = service.register("TYT67TY7");

        Assert.assertTrue(registred);
    }

    @Test
    public void testRegisterSameOrderTwice() {
        service.register("UI79UU88O");
        boolean registered = service.register("UI79UU88O");

        Assert.assertFalse(registered);
    }

    @Test
    public void testSearch() {
        service.register("TY78YU55");
        service.register("TY35JH78");
        service.register("UI79UU88O");
        service.register("UI79PO736");
        List<String> foundOrders = service.search("TY");

        Assert.assertEquals(2, foundOrders.size());
    }

    public void testSearchNonExistingOrder(){
        List<String> foundOrders = service.search("QWEQWE00");

        Assert.assertEquals(0, foundOrders.size());
    }
}