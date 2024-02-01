package com.library.Service;

import java.util.List;

import com.library.Models.Libraryroom;

public interface libraryService {

	Libraryroom getbookbyid(Integer bookid);

	List<Libraryroom> getAllBooks();

	Libraryroom addBooksinLibrary(Libraryroom libraryroom);

	Libraryroom updateBooksinLibrary(Libraryroom libraryroom);

	void deleteBooksfromLibrary(Integer bookid);
}
