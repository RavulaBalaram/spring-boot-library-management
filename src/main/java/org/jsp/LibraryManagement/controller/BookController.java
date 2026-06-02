package org.jsp.LibraryManagement.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.LibraryManagement.entity.Books;
import org.jsp.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping()
	public Books saveBook(@RequestBody Books book) {
		return service.saveBook(book);
	}
	
	@GetMapping()
	public List<Books> viewAllBooks(){
		return service.viewAllBooks();
	}
	
	@GetMapping("{id}")
	public Optional<Books> findbookById(@PathVariable int id){
		return service.findBookById(id);
	}
	
	@PutMapping("{id}")
	public Books updateBook(@PathVariable int id,@RequestBody Books book) {
		return service.updateBook(id, book);
	}
	
	@DeleteMapping("{id}")
	public String removeBookById(@PathVariable int id) {
		return service.removeBookById(id);
	}
}
