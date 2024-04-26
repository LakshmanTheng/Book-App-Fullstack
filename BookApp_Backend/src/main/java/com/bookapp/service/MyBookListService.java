package com.bookapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.MyBookList;
import com.bookapp.repository.MyBookRepository;


public class MyBookListService {
	 @Autowired
		private MyBookRepository mybook;
	     
	    public void saveMyBooks(MyBookList book)
	    {
	    	mybook.save(book);
	    }
		 
	    public List<MyBookList> getAllMyBooks()
	    {
	    	return mybook.findAll();
	    }
	    public void deleteById(int id)
	    {
	    	mybook.deleteById(id);
	    }

}
