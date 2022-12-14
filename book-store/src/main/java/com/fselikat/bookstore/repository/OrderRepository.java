package com.fselikat.bookstore.repository;

import com.fselikat.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
