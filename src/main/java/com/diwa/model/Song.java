package com.diwa.model;

public class Song {
	private String songString;
	
	public Song(String song){
		this.songString = song;
	}
	
	public Song() {
		
	}

	@Override
	public String toString() {
		return "Song [songString=" + songString + "]";
	}
	
}
