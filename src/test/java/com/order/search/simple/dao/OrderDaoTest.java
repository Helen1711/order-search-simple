package com.order.search.simple.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OrderDaoTest {
    private OrderDao dao = new OrderDao();

    @Test
    public void testRegister() {
        boolean registered = dao.register("TY89TY87");

        Assert.assertTrue(registered);
    }

    @Test
    public void testRegisterSameOrderTwice(){
        dao.register("QW15ER637");
        boolean registered = dao.register("QW15ER637");

        Assert.assertFalse(registered);
    }
}