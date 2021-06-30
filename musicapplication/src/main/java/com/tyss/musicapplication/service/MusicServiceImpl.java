package com.tyss.musicapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dao.MusicDao;
import com.tyss.musicapplication.dto.MusicPlayerResponce;
@Service
public class MusicServiceImpl implements MusicService{
	@Autowired
	MusicDao dao;

	@Override
	public List<MusicFiles> getAllSongs() {
		
		return dao.getAllSongs();
	}
	@Override
	public List<MusicFiles> getSongs(String song_title) {
		// TODO Auto-generated method stub
		return dao.getSongs(song_title);
	}

	@Override
	public boolean addSong(MusicFiles infoBean) {
		// TODO Auto-generated method stub
		return dao.addSong(infoBean);
	}

	@Override
	public boolean editSong(MusicFiles infoBean) {
		// TODO Auto-generated method stub
		return dao.editSong(infoBean);
	}

	@Override
	public boolean deleteSong(int song_id) {
		// TODO Auto-generated method stub
		return dao.deleteSong(song_id);
	}
}
