package com.library.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Models.Libraryroom;
import com.library.Repository.Libraryrepository;

@Service
public class libraryServiceImpl implements libraryService {

	@Autowired
	private Libraryrepository libraryrepository;

	@Override
	public Libraryroom getbookbyid(Integer bookid) {
		return libraryrepository.findById(bookid).orElse(null);
	}

	@Override
	public List<Libraryroom> getAllBooks() {
		return libraryrepository.findAll();
	}

	@Override
	public Libraryroom addBooksinLibrary(Libraryroom libraryroom) {
		return libraryrepository.save(libraryroom);
	}

	@Override
	public Libraryroom updateBooksinLibrary(Libraryroom libraryroom) {
		return libraryrepository.save(libraryroom);
	}

	@Override
	public void deleteBooksfromLibrary(Integer bookid) {
		libraryrepository.deleteById(bookid);
	}
}
