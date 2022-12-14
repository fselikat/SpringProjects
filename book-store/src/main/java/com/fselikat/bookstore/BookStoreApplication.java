package com.fselikat.bookstore;

import com.fselikat.bookstore.model.Book;
import com.fselikat.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder().name("Martin Eden")
				.author("Jack London").
				price(54.90)
				.stock(7).build();
		Book book2 = Book.builder().name("Doğu'nun Limanları")
				.author("Amin Maalouf").
				price(29.50)
				.stock(13).build();
		Book book3 = Book.builder().name("Şeker Portakalı")
				.author("Jose Mauro De Vasconcelos").
				price(19.90)
				.stock(1).build();

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
	}
}
