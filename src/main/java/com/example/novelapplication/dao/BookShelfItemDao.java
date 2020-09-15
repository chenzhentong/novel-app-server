package com.example.novelapplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.annotation.Rollback;

import com.example.novelapplication.model.BookShelfItem;

public interface BookShelfItemDao extends JpaRepository<BookShelfItem, Integer> {
	public BookShelfItem findByUserIdAndBookId(int userId,String bookId);
	


	@Transactional
	@Modifying
	@Query(value="delete from BookShelfItem where userId=?1 and bookId=?2")
	public void deleteBookShelfItemByUserIdAndBookId(int userId,String bookId);
	

	public List<BookShelfItem> findByUserId(int userId);
}
