package com.tyss.musicapplication.service;

import java.util.List;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dto.MusicPlayerResponce;

public interface MusicService {

	public List<MusicPlayerResponce> getAllSongs();

}
