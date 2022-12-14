package com.fselikat.bookstore.service;

import com.fselikat.bookstore.model.Book;
import com.fselikat.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
