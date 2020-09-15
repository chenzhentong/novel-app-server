package com.example.novelapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.novelapplication.model.BookReview;

public interface BookReviewDao extends JpaRepository<BookReview, Integer>{
	@Modifying(clearAutomatically=true) 
	@Query(value="from BookReview where bookId=?1",nativeQuery=false)
	public List<BookReview> findByBookId(String bookId);
	

}
