package com.tyss.musicapplication.dto;

import lombok.Data;

@Data
public class MusicPlayerResponce {
	private Integer Song_ID;
	private String Song_Title;
	private String Artist_Name;
	private String Album_Name;
	private String Song_Location;
	private String Description;
	public Integer getSong_ID() {
		return Song_ID;
	}
	public void setSong_ID(Integer song_ID) {
		Song_ID = song_ID;
	}
	public String getSong_Title() {
		return Song_Title;
	}
	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}
	public String getArtist_Name() {
		return Artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}
	public String getAlbum_Name() {
		return Album_Name;
	}
	public void setAlbum_Name(String album_Name) {
		Album_Name = album_Name;
	}
	public String getSong_Location() {
		return Song_Location;
	}
	public void setSong_Location(String song_Location) {
		Song_Location = song_Location;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
