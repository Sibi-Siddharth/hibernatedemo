package com.sibi.entity1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_song")
public class Song {
     @Id
     @GeneratedValue
	 private int Song_id;
	 public int getSong_id() {
		return Song_id;
	}

	public void setSong_id(int song_id) {
		Song_id = song_id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	private String Title;
	 private String Artist;
	 
	 @ManyToOne
	 @JoinColumn(name = "album_id")
	 private Album album;
	 
}
