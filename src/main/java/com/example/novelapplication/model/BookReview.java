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
@Table(name="book_review")
@EntityListeners(AuditingEntityListener.class)
public class BookReview implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_review_id",insertable=false,updatable=false)
	private int id;
	
	@Column(name = "book_review_book_id")
    private String bookId;
	
	@Column(name = "book_review_user_name")
    private String username;
	
	@Column(name = "book_review_publish_date")
    private String publishDate;
	@Column(name = "book_review_icon")
    private String icon;
	@Column(name = "book_review_content")
    private String content;
	@Column(name = "book_review_agree_count")
    private Integer agreeCount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getAgreeCount() {
		return agreeCount;
	}
	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}
	@Override
	public String toString() {
		return "BookReview [id=" + id + ", bookId=" + bookId + ", username=" + username + ", publishDate=" + publishDate
				+ ", icon=" + icon + ", content=" + content + ", agreeCount=" + agreeCount + "]";
	}
	public BookReview(int id, String bookId, String username, String publishDate, String icon, String content,
			Integer agreeCount) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.username = username;
		this.publishDate = publishDate;
		this.icon = icon;
		this.content = content;
		this.agreeCount = agreeCount;
	}
	public BookReview() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
