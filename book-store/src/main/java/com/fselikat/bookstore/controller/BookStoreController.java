package com.fselikat.bookstore.controller;

import com.fselikat.bookstore.dto.BookOrderRequest;
import com.fselikat.bookstore.model.Book;
import com.fselikat.bookstore.model.Order;
import com.fselikat.bookstore.service.BookService;
import com.fselikat.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;
    private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> bookList = bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }
    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> orderList = orderService.getAllOrders();
        return ResponseEntity.ok(orderList);
    }
    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdLıst(), bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }
}
