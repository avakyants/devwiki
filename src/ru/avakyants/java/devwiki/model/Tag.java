package ru.avakyants.java.devwiki.model;

import java.util.List;

public class Tag {
	
	private long id;
	private String name;
	private List<InfoCard> infoCardList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
