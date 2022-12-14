package com.fselikat.bookstore.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookOrderRequest {

    private List<Integer> bookIdLıst;
    private String userName;
}
