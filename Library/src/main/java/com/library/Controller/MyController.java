package com.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.Models.Libraryroom;
import com.library.Service.libraryService;

@RestController
public class MyController {

	@Autowired
	private libraryService libraryService;

	@GetMapping("/libraries")
	public List<Libraryroom> getAllBooks() {
		return libraryService.getAllBooks();
	}

	@GetMapping("/libraries/{bookid}")
	public Libraryroom getBookById(@PathVariable Integer bookid) {
		return libraryService.getbookbyid(bookid);
	}

	@PostMapping(path = "/libraries", consumes = "application/json")
	public ResponseEntity<Libraryroom> addBooks(@RequestBody Libraryroom libraryroom) {
		Libraryroom addedBook = libraryService.addBooksinLibrary(libraryroom);
		return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
	}

	@PutMapping("/libraries")
	public ResponseEntity<Libraryroom> updateBooks(@RequestBody Libraryroom libraryroom) {
		Libraryroom updatedBook = libraryService.updateBooksinLibrary(libraryroom);
		return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	}

	@DeleteMapping("/libraries/{bookid}")
	public ResponseEntity<Void> deleteBook(@PathVariable Integer bookid) {
		try {
			libraryService.deleteBooksfromLibrary(bookid);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (EmptyResultDataAccessException ex) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
