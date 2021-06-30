package com.tyss.musicapplication.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity
public class MusicFiles implements Serializable{
	@Id
	@Column
	private int song_Id;
	@Column
	private String song_Title;
	@Column
	private String artist_Name;
	@Column
	private String album_Name;
	@Column
	private String song_Location;
	@Column
	private String description;
	public int getSong_Id() {
		return song_Id;
	}
	public void setSong_Id(int song_Id) {
		this.song_Id = song_Id;
	}
	public String getSong_Title() {
		return song_Title;
	}
	public void setSong_Title(String song_Title) {
		this.song_Title = song_Title;
	}
	public String getArtist_Name() {
		return artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		this.artist_Name = artist_Name;
	}
	public String getAlbum_Name() {
		return album_Name;
	}
	public void setAlbum_Name(String album_Name) {
		this.album_Name = album_Name;
	}
	public String getSong_Location() {
		return song_Location;
	}
	public void setSong_Location(String song_Location) {
		this.song_Location = song_Location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
