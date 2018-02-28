package ru.avakyants.java.devwiki.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="wiki_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user") 
	private List<InfoCard> infoCardList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<InfoCard> getInfoCardList() {
		return infoCardList;
	}
	public void setInfoCardList(List<InfoCard> infoCardList) {
		this.infoCardList = infoCardList;
	}
}
