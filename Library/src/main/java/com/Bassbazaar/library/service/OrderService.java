package com.Bassbazaar.library.service;

import com.Bassbazaar.library.model.Customer;
import com.Bassbazaar.library.model.Order;
import com.Bassbazaar.library.model.ShoppingCart;

import java.util.List;

public interface OrderService
{
    Order save(ShoppingCart cart, long address_id, String paymentMethod, Double oldTotalPrice);

    void cancelOrder(long order_id);

    List<Order> findAllOrders();

    void acceptOrder(long id);

    void replaceOrderAdmin(long id);

    Order findOrderById(long id);

    List<Order> findAllOrdersByCustomer(long id);

    void updatePayment(Order order,boolean status);

    void updateOrderStatus(String status,long order_id);

    void returnOrder(long id, Customer customer);

    void replaceOrderCustomer(long id, Customer customer);
}
