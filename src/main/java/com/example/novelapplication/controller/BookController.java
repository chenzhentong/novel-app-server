package com.example.novelapplication.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.novelapplication.model.BookReview;
import com.example.novelapplication.model.BookShelfItem;
import com.example.novelapplication.service.BookService;
import com.google.gson.JsonArray;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping("/bookshelf/add")
	@Transactional
	public Boolean addBookShelfItem(@RequestBody BookShelfItem bookShelfItem) {
		System.out.println("bookShelfItem:"+bookShelfItem.toString());
		Boolean flag=false;
		//bookService.addBookShelfItem(bookShelfItem);
		if (bookService.queryByUserIdAndBookId(bookShelfItem.getUserId(), bookShelfItem.getBookId())==null) {
			bookService.addBookShelfItem(bookShelfItem);
			System.out.println(flag);
			flag= true;
		}  
		System.out.println("flag1:"+flag);
		return flag;
	}

	@RequestMapping("/bookshelf/delete/{userId}/{bookId}")
	public Boolean deleteBookShelfItem(@PathVariable("userId")int userId,
			@PathVariable("bookId")String bookId) {
		Boolean flag=false;
		BookShelfItem bookShelfItem=bookService.queryByUserIdAndBookId(userId, bookId);
		System.out.println("bookShelfItem:"+bookShelfItem);
		if (bookShelfItem!=null) {
			bookService.deleteBookShelfItemByUserIdAndBookId(userId, bookId);
			flag= true;
		} 
		System.out.println("flag2:"+flag);
		return flag;
		
	}
	@RequestMapping("/bookshelf/{userId}/{bookId}")
	public 	BookShelfItem queryBookShelfItem(@PathVariable("userId")int userId,
			@PathVariable("bookId")String bookId) {
		/*BookShelfItem bookShelfItem=new BookShelfItem();
		bookShelfItem=bookService.queryByUserIdAndBookId(userId, bookId);
		//System.out.println(bookShelfItem.toString());
		if (bookShelfItem==null) {
			return new BookShelfItem();
		} else {
			return bookShelfItem;
		}*/
		return bookService.queryByUserIdAndBookId(userId, bookId);
		
	}
	@RequestMapping("/bookshelf/all/{userId}")
	public 	List<BookShelfItem> queryBookShelfItem(@PathVariable("userId")int userId) {
	
		List<BookShelfItem> bookShelfItems= bookService.queryAllUserBookShelfItems(userId);
		System.out.println("用户:"+userId+"所有书籍"+bookShelfItems.toString());
		return bookShelfItems;
		
	}
	
	
	@RequestMapping("/bookreview/add")
	@Transactional
	public Boolean addBookReview(@RequestBody BookReview bookReview) {
		System.out.println("bookReview:"+bookReview.toString());
		Boolean flag=false;
		//bookService.addBookShelfItem(bookShelfItem);
		bookService.addBookReview(bookReview);
		return flag;
	}
	
	@RequestMapping("/bookreview/delete/{id}")
	@Transactional
	public Boolean deleteBookReview(@PathVariable("id")int id) {
		try {
			bookService.deleteBookReview(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	@RequestMapping("/bookreview/all/{id}")
	public List<BookReview> queryAllBookReviews(@PathVariable("id")String bookId){
		System.out.println("bookId:"+bookId);
		List<BookReview> bookReviews=bookService.queryAllBookReviewsByBookId(bookId);
		System.out.println("bookReviews:"+bookReviews.toString());
		
		return bookReviews;
		
	}

}
