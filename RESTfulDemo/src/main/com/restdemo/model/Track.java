package com.restdemo.model;

import java.util.ArrayList;
import java.util.List;

public class Track {

	String title = "", singer = "";
	List<Artist> artists = new ArrayList<Artist>();
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public void setArtists(List<Artist> artists){
		this.artists = artists;
	}
	
	public List<Artist> getArtists(){
		return artists;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Track [title=" + title + ", singer=" + singer + "]";
	}
}
