package com.fselikat.bookstore.controller;

import com.fselikat.bookstore.dto.BookOrderRequest;
import com.fselikat.bookstore.model.Order;
import com.fselikat.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> helloPeople(){
        return ResponseEntity.ok("Hello People");
    }
    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdLıst(), bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }
}
