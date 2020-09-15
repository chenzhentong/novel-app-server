package com.example.novelapplication.service;

import java.util.List;

import com.example.novelapplication.model.BookReview;
import com.example.novelapplication.model.BookShelfItem;

public interface BookService {
	
	//将书籍添加到书架
	public void addBookShelfItem(BookShelfItem bookShelfItem);
	//从书架中移出书架
	public void deleteBookShelfItemByUserIdAndBookId(int userId,String bookId);
	//查看用户书架中是否有该书籍
	public BookShelfItem queryByUserIdAndBookId(int userId,String bookId);
	//查询用户所有书架书籍
	public List<BookShelfItem> queryAllUserBookShelfItems(int userId);

	
	
	//添加书籍评论
	public void addBookReview(BookReview bookReview);
	//删除书籍评论
	public void deleteBookReview(int id);
	//查询所有书籍评论
	public List<BookReview> queryAllBookReviewsByBookId(String bookId);
	
	
	

}
