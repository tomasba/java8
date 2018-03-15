package com.java8.fnc.find_in_collection;

public class MyDto {

	private int number;
	private String value;
	
	public MyDto() {
	}
	
	public MyDto(int number, String value) {
		this.number = number;
		this.value = value;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return number + " " + value;		
	}
	
}
