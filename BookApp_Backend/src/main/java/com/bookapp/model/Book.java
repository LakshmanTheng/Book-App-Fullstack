package com.bookapp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;

	    private String name;
	    private String author;
	    private String publisher;
	    private String publishingDate;
	    private int totalCopies;
	    private int copiesIssued;
	    private int copiesAvailable;
	    private int price;
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getPublishingDate() {
			return publishingDate;
		}
		public void setPublishingDate(String publishingDate) {
			this.publishingDate = publishingDate;
		}
		public int getTotalCopies() {
			return totalCopies;
		}
		public void setTotalCopies(int totalCopies) {
			this.totalCopies = totalCopies;
		}
		public int getCopiesIssued() {
			return copiesIssued;
		}
		public void setCopiesIssued(int copiesIssued) {
			this.copiesIssued = copiesIssued;
		}
		public int getCopiesAvailable() {
			return copiesAvailable;
		}
		public void setCopiesAvailable(int copiesAvailable) {
			this.copiesAvailable = copiesAvailable;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public Book(int id, String name, String author, String publisher, String publishingDate, int totalCopies,
				int copiesIssued, int copiesAvailable, int price) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.publishingDate = publishingDate;
			this.totalCopies = totalCopies;
			this.copiesIssued = copiesIssued;
			this.copiesAvailable = copiesAvailable;
			this.price=price;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}	
}