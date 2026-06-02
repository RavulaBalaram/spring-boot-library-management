package org.jsp.LibraryManagement.service;


import java.util.List;
import java.util.Optional;

import org.jsp.LibraryManagement.dao.BookDao;
import org.jsp.LibraryManagement.entity.Books;
import org.jsp.LibraryManagement.exceptions.BookAlreadyExists;
import org.jsp.LibraryManagement.exceptions.NoBookFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookDao dao;
	
	public Books saveBook(Books book) {
		Optional<Books> opt=dao.findBookByTitle(book.getTitle());
		if(opt.isPresent()) {
			throw new BookAlreadyExists("Duplicate Entry - Book Already Exists");
		}
		return dao.saveBook(book);
	}
 
	public List<Books> viewAllBooks() {
		List<Books> book=dao.viewAllBooks();
		if(book.isEmpty())
			throw new NoBookFound("No data Found");
		return book;
	}
	
	public Optional<Books> findBookById(int id) {
		return dao.findBookById(id);
	}

	public Books updateBook(int id,Books book) {
		
		Optional<Books> existingBook=dao.findBookById(id);
		if(existingBook.isPresent()) {
			Books dbBook=existingBook.get();
			dbBook.setTitle(book.getTitle());
			dbBook.setAuthor(book.getAuthor());
			dbBook.setPages(book.getPages());
			dbBook.setPrice(book.getPrice());
			dbBook.setLocalDate();
			return dao.saveBook(dbBook);
			}
		throw new NoBookFound("Book Doesn't Exists");
	}

	public String removeBookById(int id) {
		Optional<Books> opt=dao.findBookById(id);
		if(opt.isPresent()) {
			dao.removeBookById(id);
			return "Book Deleted Succesfully";
		}
		throw new NoBookFound("No Data Found");
	}
	
}
