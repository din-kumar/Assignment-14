package com.example.Agent;

public class Agent {

	private int id;
	private String Name;
	private String commisssion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCommisssion() {
		return commisssion;
	}
	public void setCommisssion(String commisssion) {
		this.commisssion = commisssion;
	}
	public Agent(int id, String name, String commisssion) {
		super();
		this.id = id;
		Name = name;
		this.commisssion = commisssion;
	}
	
	
}
