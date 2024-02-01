package com.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.Models.Libraryroom;

@Repository
public interface Libraryrepository extends JpaRepository<Libraryroom, Integer> {

}
