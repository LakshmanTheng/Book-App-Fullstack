package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.repository.BookRepository;

@SpringBootApplication
public class BookAppBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BookAppBackendApplication.class, args);
		System.out.println("Book App run in backend....");
	}

}