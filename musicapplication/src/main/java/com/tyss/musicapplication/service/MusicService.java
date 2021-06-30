package com.tyss.musicapplication.service;

import java.util.List;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dto.MusicPlayerResponce;

public interface MusicService {

	public List<MusicFiles> getAllSongs();

	public List<MusicFiles> getSongs(String song_title);

	public boolean addSong(MusicFiles infoBean);

	public boolean editSong(MusicFiles infoBean);

	public boolean deleteSong(int song_id);


}
