package com.example.novelapplication.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.novelapplication.dao.BookReviewDao;
import com.example.novelapplication.dao.BookShelfItemDao;
import com.example.novelapplication.model.BookReview;
import com.example.novelapplication.model.BookShelfItem;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookShelfItemDao bookShelfItemDao;

	@Autowired
	private BookReviewDao bookReviewDao;

	@Override
	public void addBookShelfItem(BookShelfItem bookShelfItem) {
		// TODO Auto-generated method stub
		bookShelfItemDao.save(bookShelfItem);
	}


	@Override
	public void addBookReview(BookReview bookReview) {
		// TODO Auto-generated method stub
		bookReviewDao.save(bookReview);
	}

	@Override
	public void deleteBookReview(int id) {
		// TODO Auto-generated method stub
		bookReviewDao.delete(id);
	}

	@Override
	public BookShelfItem queryByUserIdAndBookId(int userId, String bookId) {
		// TODO Auto-generated method stub
		return bookShelfItemDao.findByUserIdAndBookId(userId, bookId);
	}



	@Override
	public void deleteBookShelfItemByUserIdAndBookId(int userId, String bookId) {
		// TODO Auto-generated method stub
		bookShelfItemDao.deleteBookShelfItemByUserIdAndBookId(userId, bookId);
		bookShelfItemDao.flush();
	}


	@Override
	public List<BookReview> queryAllBookReviewsByBookId( String bookId) {
		// TODO Auto-generated method stub
	
		return bookReviewDao.findByBookId(bookId);
	}


	@Override
	public List<BookShelfItem> queryAllUserBookShelfItems(int userId) {
		// TODO Auto-generated method stub
		return bookShelfItemDao.findByUserId(userId);
	}
	
	
	
	
}
