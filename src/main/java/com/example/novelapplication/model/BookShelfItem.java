package com.example.novelapplication.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="bookshelf_item")
@EntityListeners(AuditingEntityListener.class)
public class BookShelfItem implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookshelf_item_id",insertable=false,updatable=false)
	private int id;
	@Column(name = "bookshelf_item_user_id",nullable=false)
    private int userId;
	@Column(name = "bookshelf_item_book_id",nullable=false)
    private String bookId;
	@Column(name = "bookshelf_item_book_title",nullable=true)
    private String bookTitle;
	@Column(name = "bookshelf_item_created_date",nullable=true)
    private String createDate;
	@Column(name = "bookshelf_item_book_cover",nullable=true)
    private String bookCover;
	@Column(name = "bookshelf_item_book_last_chapter",nullable=true)
    private String bookLastChapter;
	@Column(name = "bookshelf_item_book_updated_date",nullable=true)
    private String bookUpdatedDate;
	
    public BookShelfItem(int id){
        this.id=id;
    }
    public BookShelfItem(int id, int userId, String bookId, String bookTitle,
                         String createDate, String bookCover, String bookLastChapter,
                         String bookUpdatedDate) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.createDate = createDate;
        this.bookCover = bookCover;
        this.bookLastChapter = bookLastChapter;
        this.bookUpdatedDate = bookUpdatedDate;
    }

    public BookShelfItem() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public String getBookLastChapter() {
        return bookLastChapter;
    }

    public void setBookLastChapter(String bookLastChapter) {
        this.bookLastChapter = bookLastChapter;
    }

    public String getBookUpdatedDate() {
        return bookUpdatedDate;
    }

    public void setBookUpdatedDate(String bookUpdatedDate) {
        this.bookUpdatedDate = bookUpdatedDate;
    }
	@Override
	public String toString() {
		return "BookShelfItem [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", bookTitle=" + bookTitle
				+ ", createDate=" + createDate + ", bookCover=" + bookCover + ", bookLastChapter=" + bookLastChapter
				+ ", bookUpdatedDate=" + bookUpdatedDate + "]";
	}
}
