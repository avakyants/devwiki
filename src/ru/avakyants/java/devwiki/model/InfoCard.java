package ru.avakyants.java.devwiki.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="wiki_infocard")
public class InfoCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="author",nullable=true)
	private User author;
	
	@Column(name="text")
	private String text;
	
	@Column(name="level")
	private Levels level;
	
	@Column(name="rating")
	private float rating;
	
	
	private List<Tag> tagList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Levels getLevel() {
		return level;
	}
	public void setLevel(Levels level) {
		this.level = level;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {		
		this.rating = (rating<0)?0:((rating>5)?5:rating);
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	
}
