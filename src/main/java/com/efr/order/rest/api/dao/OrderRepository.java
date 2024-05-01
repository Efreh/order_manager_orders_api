package com.efr.order.rest.api.dao;

import com.efr.order.rest.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
