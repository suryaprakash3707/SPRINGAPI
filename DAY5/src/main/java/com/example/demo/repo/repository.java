package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Book;

@Repository
public interface repository extends JpaRepository<Book,Integer> {
    
	
}