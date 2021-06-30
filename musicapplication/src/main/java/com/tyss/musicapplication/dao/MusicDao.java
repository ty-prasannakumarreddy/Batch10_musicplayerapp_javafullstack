package com.tyss.musicapplication.dao;

import java.util.List;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dto.MusicPlayerResponce;

public interface MusicDao {

	public List<MusicPlayerResponce> getAllSongs();

}
