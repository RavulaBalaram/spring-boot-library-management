package org.jsp.LibraryManagement.dao;


import java.util.List;
import java.util.Optional;

import org.jsp.LibraryManagement.entity.Books;
import org.jsp.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

	@Autowired
	private BookRepository repository;
	
	public Books saveBook(Books book) {
		return repository.save(book);
	}
	
	public Optional<Books> findBookByTitle(String title){
		Optional<Books> opt=repository.findBookByTitle(title);
		return opt;
	}

	public List<Books> viewAllBooks() {
		return repository.findAll();
	}

	public Optional<Books> findBookById(int id) {
		return repository.findById(id);
	}
	
	public Books updateBook(Books book) {
		return repository.save(book);
	}

	public void removeBookById(int id) {
		 repository.deleteById(id);
	}
	
}
