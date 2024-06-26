package com.bookapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.Book;
import com.bookapp.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookrepo;
	
	@GetMapping("/allBooks")
	public List<Book> gettAllBooks(){
		return bookrepo.findAll();
	}
}
