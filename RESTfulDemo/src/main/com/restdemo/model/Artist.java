package com.restdemo.model;

public class Artist {

	String artistName = "";
	int artistAge = 0;
	
	public Artist(){
		
	}
	
	public void setArtistName(String artName){
		this.artistName = artName;
	}
	
	public String getArtistName(){
		return artistName;
	}
	
	public void setArtistAge(int artAge){
		this.artistAge = artAge;
	}
	
	public int getArtistAge(){
		return artistAge;
	}
}
