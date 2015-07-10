package com.diwa.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Player {
	private Instrument instrument;
	
	private Song song;
	
	
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	public void play(){
		instrument.play();
		System.out.println(song);
	}
	
}
